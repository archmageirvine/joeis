package irvine.oeis.a316;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Point;

/**
 * A068590.
 * @author Sean A. Irvine
 */
public class A316667 extends Sequence1 {

  private static final int[] DELTA_X = {1, 0, -1, 0};
  private static final int[] DELTA_Y = {0, 1, 0, -1};
  private static final int[] KNIGHT_DELTA_X = {2, 1, -1, -2, -2, -1, 1, 2};
  private static final int[] KNIGHT_DELTA_Y = {1, 2, 2, 1, -1, -2, -2, -1};
  private final int mJ;
  private Point mPoint = null;

  private long mM = 1;
  private int mX = 0;
  private int mY = 0;
  private int mZ = 1;
  private int mD = 0;
  private int mE = 0;
  private final Map<Point, Long> mSpiral = new HashMap<>();
  private final Set<Point> mUsed = new HashSet<>();

  protected A316667(final int j) {
    mJ = j;
  }

  /** Construct the sequence. */
  public A316667() {
    this(7);
  }

  private long findPos(final Point wanted) {
    while (!mSpiral.containsKey(wanted)) {
      mSpiral.put(new Point(mX, mY), mM);
      ++mM;
      if (--mZ < 0) {
        if (++mD == DELTA_X.length) {
          mD = 0;
        }
        if (DELTA_X[mD] != 0) {
          ++mE;
        }
        mZ = mE;
      }
      mX += DELTA_X[mD];
      mY += DELTA_Y[mD];
    }
    return mSpiral.get(wanted);
  }

  @Override
  public Z next() {
    if (mPoint == null) {
      mPoint = new Point(0, 0);
      mUsed.add(mPoint);
      return Z.valueOf(findPos(mPoint));
    } else if (mUsed.size() == 1) {
      mPoint = new Point(mPoint.left() + KNIGHT_DELTA_X[mJ], mPoint.right() + KNIGHT_DELTA_Y[mJ]);
      mUsed.add(mPoint);
      return Z.valueOf(findPos(mPoint));
    } else {
      long bestPos = Long.MAX_VALUE;
      Point bestP = null;
      for (int k = 0; k < KNIGHT_DELTA_X.length; ++k) {
        final Point p = new Point(mPoint.left() + KNIGHT_DELTA_X[k], mPoint.right() + KNIGHT_DELTA_Y[k]);
        if (!mUsed.contains(p)) {
          final long pos = findPos(p);
          if (pos < bestPos) {
            bestPos = pos;
            bestP = p;
          }
        }
      }
      if (bestP == null) {
        return null;
      }
      mUsed.add(bestP);
      mPoint = bestP;
      return Z.valueOf(bestPos);
    }
  }
}

/*
(PARI) \\Ellermann's clockwise square spiral, first step (0, 0) -> (0, 1)
y=vector(10000); L=0; d=1; n=0;
for(r=1, 100, d=-d; k=floor(r/2)*d; for(j=1, L++, y[n++]=k); forstep(j=k-d, -floor((r+1)/2)*d+d, -d, y[n++]=j));
x=vector(10100); L=1; d=-1; n=0;
for(r=1, 100, d=-d; k=floor(r/2)*d; for(j=1, L++, x[n++]=-k); forstep(j=k-d, -floor((r+1)/2)*d+d, -d, x[n++]=-j));
\\ Position in spiral

atan2(y, x)=if(x>0, atan(y/x), if(x==0, if(y>0, Pi/2, -Pi/2), if(y>=0, atan(y/x)+Pi, atan(y/x)-Pi)));

angle(v, w)=atan2(v[1]*w[2]-v[2]*w[1], v[1]*w[1]+v[2]*w[2]);

move=[2, 1; 1, 2; -1, 2; -2, 1; -2, -1; -1, -2; 1, -2; 2, -1]; \\ 8 Knight moves

m=6; b=matrix(2*m+1, 2*m+1, i, j, 0); setb(pos)={b[pos[1]+m+1, pos[2]+m+1]=1};

getb(pos)=b[pos[1]+m+1, pos[2]+m+1];

inring(n, p)=!(abs(p[1])<n&&abs(p[2])<n)&&abs(p[1])<=n+1&&abs(p[2])<=n+1;

p=[0, 0];
setb(p);
print1(findpos(p[1], p[2]), ", ");
p+=move[3, ];
setb(p);
forstep(n=1, m-3, 2, my(angmin, jmin, jlast);
  until(jmin==0,
    print1(findpos(p[1], p[2]), ", ");
    angmin=-2*Pi;
    jmin=0;
    for(j=1, #move[, 1], my(ptry=p+move[j, ], adiff);
      if(inring(n, ptry),
        if(!getb(ptry),
          adiff=angle(p, ptry);
          if(adiff<=0,
            if(adiff>angmin, jmin=j; angmin=adiff; jlast=j)
          )
        )
      )
    );
    if(jmin>0, p+=move[jmin, ]; setb(p); );
  );
  p+=move[jlast, ];
  setb(p)
); \\ Hugo Pfoertner, May 11 2019

 */
