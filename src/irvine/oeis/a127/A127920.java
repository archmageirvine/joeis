package irvine.oeis.a127;
// manually knestm/knest at 2023-03-02 16:06

import irvine.math.z.Z;

/**
 * A127920 1/6 of product of three numbers: n-th prime, previous and following number.
 * @author Georg Fischer
 */
public class A127920 extends A127918 {

  @Override
  public Z next() {
    return super.next().divide(3);
  }
}
