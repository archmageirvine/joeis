package irvine.oeis.a326;
// manually at 2021-07-04

import irvine.math.z.Z;
import irvine.oeis.a133.A133058; 

/**
 * A326994 Fourth quadrisection of A133058.
 * @author Georg Fischer
 */
public class A326994 extends A133058 {

  /** Construct the sequence. */
  public A326994() {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    super.next();
    super.next();
    return result;
  }
}
