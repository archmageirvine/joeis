package irvine.oeis.a073;
// manually at 2021-07-04

import irvine.math.z.Z;
import irvine.oeis.a007.A007294;

/**
 * A073471 Trisection of A007294.
 * @author Georg Fischer
 */
public class A073471 extends A007294 {

  /** Construct the sequence. */
  public A073471() {
    super.next();
  }

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    super.next();
    return result;
  }
}
