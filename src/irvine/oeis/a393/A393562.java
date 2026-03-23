package irvine.oeis.a393;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A393562 a(n) is the number of unit squares in the square lattice, divided by 4, that have at least one vertex strictly inside and at least one vertex strictly outside the circle x^2 + y^2 = n.
 * at least one vertex strictly inside and at least one vertex strictly outside the circle x^2 + y^2 = n.
 * @author Georg Fischer
 */
public class A393562 extends AbstractSequence implements DirectSequence {

  protected final long[] mS; // position of the vertices
  protected long mN; // current index
  protected final int mLimitLo; // test mS[0..mLimitLo-1] for "<"
  protected final int mLimitHi; // test mS[mLimitHi-1..DIM-1] for ">"
  protected final long mFactor; // divide the result by this number
  protected int mDim; // dimension of mS, = 2^dim
  protected final int mShift; // =1 for all vertices, =2 for vertices with odd coordinates (x+-1/2)

  /** Construct the sequence. */
  public A393562() {
    this(0, 2, 1, 1, 1, 1);
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param dim dimension: 2 = square, 3 = cubic lattice
   * @param inside number of vertices that must lay stricly inside
   * @param outside number of vertices that must lay stricly outside
   * @param factor divide the result by this number
   * @param shift =1 for all vertices, =2 for vertices with odd coordinates (x+-1/2)
   */
  public A393562(final int offset, int dim, final int inside, final int outside, final long factor, final int shift) {
    super(offset);
    mN = offset - 1;
    mFactor = factor;
    mShift = shift;
    mDim = 2;
    while (--dim >= 1) {
      mDim *= 2;
    }
    mLimitLo = outside;
    mLimitHi = mDim + 1 - inside;
    mS = new long[mDim];
  }

  @Override
  public Z a(final Z n) {
    return a(n.longValueExact());
  }

  @Override
  public Z a(final long n) {
    /*
      GP/PARI
      a(n) = {my(np=sqrtint(n), c=0, s=vector(4));
      for(x=0, np,
        my(x2=x^2, x2p=(x+1)^2);
        for(y=0, np,
          my(y2=y^2, y2p=(y+1)^2, s=[n-x2-y2, n-x2-y2p, n-x2p-y2, n-x2p-y2p]);
          s=vecsort(s);
          c += (s[1]<0 && s[4]>0)
        )
      );
      c}
      print1("A393562: "); for(n=0,32,print1(a(n),", "))
    */
    final long np = Functions.SQRT.l(n);
    final long ilo = mShift == 1 ? 0L : -(np + 1); // low bound for x, y, z
    final long ihi = mShift == 1 ? np : np + 1; // high bound for x, y, z
    final long n14 = mShift == 1 ? n : 4L * n; // compare with this radius
    long cnt = 0L;
    for (long ix = ilo; ix <= ihi; ++ix) {
      long x2m = mShift == 1 ? ix : 2L * ix - 1L;
      x2m = x2m * x2m;
      long x2p = mShift == 1 ? ix + 1 : 2L * ix + 1L;
      x2p = x2p * x2p;
      for (long iy = ilo; iy <= ihi; ++iy) {
        long y2m = mShift == 1 ? iy : 2L * iy - 1L;
        y2m = y2m * y2m;
        long y2p = mShift == 1 ? iy + 1 : 2L * iy + 1L;
        y2p = y2p * y2p;
        if (mDim == 4) {
          mS[0] = n14 - x2m - y2m;
          mS[1] = n14 - x2m - y2p;
          mS[2] = n14 - x2p - y2m;
          mS[3] = n14 - x2p - y2p;
          Arrays.sort(mS);
          if (mS[mLimitLo - 1] < 0L && mS[mLimitHi - 1] > 0L) {
            ++cnt;
          }
        } else { // mDim == 8
          for (long iz = ilo; iz <= ihi; ++iz) {
            long z2m = mShift == 1 ? iz : 2L * iz - 1L;
            z2m = z2m * z2m;
            long z2p = mShift == 1 ? iz + 1 : 2L * iz + 1L;
            z2p = z2p * z2p;
            mS[0] = n14 - x2m - y2m - z2m;
            mS[1] = n14 - x2m - y2p - z2m;
            mS[2] = n14 - x2p - y2m - z2m;
            mS[3] = n14 - x2p - y2p - z2m;
            mS[4] = n14 - x2m - y2m - z2p;
            mS[5] = n14 - x2m - y2p - z2p;
            mS[6] = n14 - x2p - y2m - z2p;
            mS[7] = n14 - x2p - y2p - z2p;
            Arrays.sort(mS);
            if (mS[mLimitLo - 1] < 0L && mS[mLimitHi - 1] > 0L) {
              ++cnt;
            }
          }
        }
      }
    }
    return Z.valueOf(cnt / mFactor);
  }

  @Override
  public Z next() {
    return a(++mN);
  }

}
