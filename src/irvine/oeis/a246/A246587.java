package irvine.oeis.a246;
// manually (bisect) 2021-07-05

import irvine.math.z.Z;


/**
 * A246587 Second trisection of A246584.
 * @author Georg Fischer
 */
public class A246587 extends A246584 {

  /** Construct the sequence. */
  public A246587() {
    super.next();
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
