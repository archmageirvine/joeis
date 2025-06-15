package irvine.oeis.a077;

import irvine.oeis.a183.A183187;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077781.
 * @author Sean A. Irvine
 */
public class A077794 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077794() {
    super(1, new A183187(), k -> k.multiply2().add(1));
  }
}

