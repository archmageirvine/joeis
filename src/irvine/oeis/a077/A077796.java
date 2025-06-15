package irvine.oeis.a077;

import irvine.oeis.a183.A183183;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077781.
 * @author Sean A. Irvine
 */
public class A077796 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077796() {
    super(1, new A183183(), k -> k.multiply2().add(1));
  }
}

