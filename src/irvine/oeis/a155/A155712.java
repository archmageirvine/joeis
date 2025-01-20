package irvine.oeis.a155;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a092.A092572;

/**
 * A155712 Intersection of A092572 and A155716: N = a^2 + 3b^2 = c^2 + 6d^2 for some positive integers a,b,c,d.
 * @author Sean A. Irvine
 */
public class A155712 extends IntersectionSequence {

  /** Construct the sequence. */
  public A155712() {
    super(1, new A092572(), new A155716());
  }
}
