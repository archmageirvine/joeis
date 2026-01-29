package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083466 Smallest nontrivial multiple of n ending in n. By nontrivial one means a(n) is not equal to n or concatenation of n with itself.
 * @author Sean A. Irvine
 */
public class A083466 extends Sequence1 {

  private long mN = 0;
  private long mMod = 10;

  @Override
  public Z next() {
    if (++mN == mMod) {
      mMod *= 10;
    }
    final Z forbidden = new Z(String.valueOf(mN).repeat(2));
    Z t = Z.valueOf(mN);
    while (true) {
      t = t.add(mN);
      if (t.mod(mMod) == mN && !t.equals(forbidden)) {
        return t;
      }
    }
  }
}
