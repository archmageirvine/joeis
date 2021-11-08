package irvine.oeis.a346;
// manually 2021-08-15

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A346678 Positive numbers whose squares end in exactly two identical digits.
 * @author Georg Fischer
 */
public class A346678 implements Sequence {

  protected int mN;

  /** Construct the sequence. */
  public A346678() {
    mN = 0;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final int last3 = Z.valueOf(mN).square().mod(Z.valueOf(1000)).intValue();
      if (last3 % 10 == (last3 % 100) / 10 && last3 % 10 != last3 / 100) {
        return Z.valueOf(mN);
      }
    }
  }
}
