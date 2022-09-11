package irvine.oeis.a110;

import irvine.math.z.Z;

/**
 * A110725 [{n concatenate R(n)} + {R(n) concatenate n}]/11, where R(n) = digit reversal of n.
 * @author Georg Fischer
 */
public class A110725 extends A110724 {

  @Override
  public Z next() {
    return super.next().divide(11);
  }
}
