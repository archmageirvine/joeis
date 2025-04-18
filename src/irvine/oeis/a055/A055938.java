package irvine.oeis.a055;

import irvine.oeis.ComplementSequence;
import irvine.oeis.a005.A005187;

/**
 * A055938 Integers not generated by b(n) = b(floor(n/2)) + n (complement of A005187).
 * @author Sean A. Irvine
 */
public class A055938 extends ComplementSequence {

  /** Construct the sequence. */
  public A055938() {
    super(new A005187());
  }
}
