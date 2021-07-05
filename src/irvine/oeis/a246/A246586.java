package irvine.oeis.a246;
// manually (bisect) 2021-07-05

import irvine.math.z.Z;


/**
 * A246586 First trisection of A246584.
 * @author Georg Fischer
 */
public class A246586 extends A246584 {

  /** Construct the sequence. */
  public A246586() {
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
