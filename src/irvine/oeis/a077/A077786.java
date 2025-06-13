package irvine.oeis.a077;

import irvine.oeis.a183.A183186;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077781.
 * @author Sean A. Irvine
 */
public class A077786 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077786() {
    super(1, new A183186(), k -> k.multiply2().add(1));
  }
}

