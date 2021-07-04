package irvine.oeis.a326;
// manually at 2021-07-04

import irvine.math.z.Z;
import irvine.oeis.a133.A133058; 

/**
 * A326992 Second quadrisection of A133058.
 * @author Georg Fischer
 */
public class A326992 extends A133058 {

  /** Construct the sequence. */
  public A326992() {
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
