package irvine.oeis.a077;

import irvine.oeis.a183.A183181;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077781.
 * @author Sean A. Irvine
 */
public class A077788 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077788() {
    super(1, new A183181(), k -> k.multiply2().add(1));
  }
}

