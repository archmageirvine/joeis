package irvine.oeis.a357;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A357274 List of primitive triples for integer-sided triangles with angles A &lt; B &lt; C and C = 2*Pi/3 = 120 degrees.
 * @author Georg Fischer
 */
public class A357274 extends Sequence1 {

  private int mN = -1;
  private long mC = 5;
  private long mA = 2;
  private static final int LAST = 2;
  private final Z[] mTuple = new Z[LAST + 1];

  /* Maple:
  for c from 5 to 181 by 2 do
    for a from 3 to c-2 do
      b := (-a + sqrt(4*c^2-3*a^2))/2;
      if b=floor(b) and gcd(a, b)=1 and a<b then print(a, b, c); end if;
    end do;
  end do;
  */
  @Override
  public Z next() {
    while (true) {
      if (mN >= 1) {
        --mN;
        return mTuple[LAST - mN];
      }
      if (++mA >= mC - 1) {
        mC += 2;
        mA = 3;
      }
      final Z expr = Z.valueOf(4 * mC * mC - 3 * mA * mA);
      if (expr.isSquare()) {
        final Z b2 = expr.sqrt().subtract(mA);
        if (b2.isEven()) {
          final Z bz = b2.shiftRight(1);
          final Z az = Z.valueOf(mA);
          if (az.gcd(bz).equals(Z.ONE) && az.compareTo(bz) < 0) {
            mTuple[0] = az;
            mTuple[1] = bz;
            mTuple[2] = Z.valueOf(mC);
            mN = LAST;
            return mTuple[LAST - mN];
          }
        }
      }
    }
  }
}
