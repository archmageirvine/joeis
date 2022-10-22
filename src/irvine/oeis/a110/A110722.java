package irvine.oeis.a110;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A110722 {n concatenate R(n)}*{ R(n) concatenate n}, where R(n) = digit reversal of n.
 * @author Georg Fischer
 */
public class A110722 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final String forward = String.valueOf(mN);
    final String reverse = new StringBuilder().append(forward).reverse().toString();
    return new Z(forward + reverse).multiply(new Z(reverse + forward));
  }
}
