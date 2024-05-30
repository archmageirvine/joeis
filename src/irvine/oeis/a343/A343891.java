package irvine.oeis.a343;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A343891 List of primitive triples (a, b, c) for integer-sided triangles where side a is the harmonic mean of the 2 other sides b and c, i.e., 2/a = 1/b + 1/c with b &lt; a &lt; c.
 * @author Georg Fischer
 */
public class A343891 extends Sequence1 {

  private int mN = -1;
  private long mA = 3;
  private long mB = 4;
  private final long mC = 0;
  private static final int LAST = 2;
  private final Z[] mTuple = new Z[LAST + 1];

  /* Maple:
  for a from 4 to 200 do
    for b from floor(a/2)+1 to a-1 do
      c := a*b/(2*b-a);
      if c=floor(c) and igcd(a, b, c)=1 and c-b<a then print(a, b, c); end if;
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
      if (++mB >= mA) {
        ++mA;
        mB = mA / 2 + 1;
      }
      final long ab = mA * mB;
      final long ba2 = 2 * mB - mA;
      final long c = ab / ba2;
      if (c * ba2 == ab && Functions.GCD.l(mA, mB, c) == 1 && c - mB < mA) {
        mTuple[0] = Z.valueOf(mA);
        mTuple[1] = Z.valueOf(mB);
        mTuple[2] = Z.valueOf(c);
        mN = LAST;
        return mTuple[LAST - mN];
      }
    }
  }
}
