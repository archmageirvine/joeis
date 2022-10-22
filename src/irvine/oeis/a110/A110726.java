package irvine.oeis.a110;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A110726 Absolute({n concatenate R(n)}-{ R(n) concatenate n}), R(n) = digit reversal of n.
 * @author Georg Fischer
 */
public class A110726 extends AbstractSequence {

  private long mN = 9;

  /** Construct the sequence. */
  public A110726() {
    super(10);
  }

  @Override
  public Z next() {
    ++mN;
    final String forward = String.valueOf(mN);
    final String reverse = new StringBuilder().append(forward).reverse().toString();
    return new Z(forward + reverse).subtract(new Z(reverse + forward)).abs();
  }
}
