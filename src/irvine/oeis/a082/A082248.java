package irvine.oeis.a082;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A082248 a(n) = A082247(n)/7.
 * @author Sean A. Irvine
 */
public class A082248 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A082248() {
    super(1, new A082247(), k -> k.divide(7));
  }
}
