package irvine.oeis.a077;

import irvine.oeis.a183.A183177;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077781.
 * @author Sean A. Irvine
 */
public class A077792 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077792() {
    super(1, new A183177(), k -> k.multiply2().add(1));
  }
}

