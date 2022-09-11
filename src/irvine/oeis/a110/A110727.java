package irvine.oeis.a110;

import irvine.math.z.Z;

/**
 * A110727 Absolute({n concatenate R(n)}-{R(n) concatenate n})/11, where R(n) = digit reversal of n.
 * @author Georg Fischer
 */
public class A110727 extends A110726 {

  @Override
  public Z next() {
    return super.next().divide(11);
  }
}
