package irvine.oeis.a335;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A335893 Primitive triples for integer-sided triangles whose angles A &lt; B &lt; C are in arithmetic progression.
 * @author Georg Fischer
 */
public class A335893 extends Sequence1 {

  private int mN = -1;
  private long mB = 6;
  private long mC = 17; // > 6 * mB / 5
  private static final int LAST = 5;
  private final Z[] mTuple = new Z[LAST + 1];

/* Maple:
for b from 3 to 250 by 2 do
  for c from b+1 to 6*b/5 do
    a := (c - sqrt(4*b^2-3*c^2))/2;
    if gcd(a, b)=1 and issqr(4*b^2-3*c^2) then print(a, b, c, c-a, b, c); end if;
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
      if (++mC > 6 * mB / 5) {
        ++mB;
        mC = mB + 1;
      }
      final long bb4cc3 = 4 * mB * mB - 3 * mC * mC;
     // if (true || bb4cc3 >= 0) {
        final Z expr = Z.valueOf(bb4cc3).abs();
        final long a = mC - expr.sqrt().longValue();
      if (((a & 1) == 0) && Functions.GCD.l(a >> 1, mB) == 1 && expr.isSquare()) {
          mTuple[0] = Z.valueOf(a >> 1);
          mTuple[1] = Z.valueOf(mB);
          mTuple[2] = Z.valueOf(mC);
          mTuple[3] = Z.valueOf(mC - (a >> 1));
          mTuple[4] = Z.valueOf(mB);
          mTuple[5] = Z.valueOf(mC);
          mN = LAST;
          return mTuple[LAST - mN];
        }
     // }
    }
  }
}
