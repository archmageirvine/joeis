package irvine.oeis.a082;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A082552/
 * @author Sean A. Irvine
 */
public class A082565 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A082565() {
    super(1, new A082520(), p -> p.multiply2().add(1));
  }
}
