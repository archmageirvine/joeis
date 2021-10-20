package irvine.oeis.a073;
// manually 2021-10-19

import irvine.math.z.Z;

/**
 * A073221 The terms of A073213 (sums of two powers of 17) divided by 2. 
 * @author Georg Fischer
 */
public class A073221 extends A073213 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
