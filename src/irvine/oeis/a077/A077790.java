package irvine.oeis.a077;

import irvine.oeis.a183.A183176;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077781.
 * @author Sean A. Irvine
 */
public class A077790 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077790() {
    super(1, new A183176(), k -> k.multiply2().add(1));
  }
}

