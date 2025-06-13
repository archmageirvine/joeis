package irvine.oeis.a077;

import irvine.oeis.a183.A183180;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077781.
 * @author Sean A. Irvine
 */
public class A077785 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077785() {
    super(1, new A183180().skip(), k -> k.multiply2().add(1));
  }
}

