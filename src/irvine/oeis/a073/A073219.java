package irvine.oeis.a073;
// manually 2021-10-19

import irvine.math.z.Z;

/**
 * A073219 The terms of A073211 (sums of two powers of 11) divided by 2. 
 * @author Georg Fischer
 */
public class A073219 extends A073211 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
