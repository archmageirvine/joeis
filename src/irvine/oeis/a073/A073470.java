package irvine.oeis.a073;
// manually at 2021-07-04

import irvine.math.z.Z;
import irvine.oeis.a007.A007294;

/**
 * A073470 Trisection of A007294.
 * @author Georg Fischer
 */
public class A073470 extends A007294 {

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    super.next();
    return result;
  }
}
