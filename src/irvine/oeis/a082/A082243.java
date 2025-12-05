package irvine.oeis.a082;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A082243 a(n) = A082242(n)/4.
 * @author Sean A. Irvine
 */
public class A082243 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A082243() {
    super(1, new A082242(), k -> k.divide(4));
  }
}
