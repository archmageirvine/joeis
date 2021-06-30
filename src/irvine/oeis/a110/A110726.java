package irvine.oeis.a110;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A110726 Absolute({n concatenate R(n)}-{ R(n) concatenate n}), R(n) = digit reversal of n.
 * @author Sean A. Irvine
 */
public class A110726 implements Sequence {

  private long mN = 9;

  @Override
  public Z next() {
    final String forward = String.valueOf(++mN);
    final String reverse = new StringBuilder().append(forward).reverse().toString();
    return new Z(forward + reverse).subtract(new Z(reverse + forward)).abs();
  }
}

