package irvine.oeis.a084;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A084018 A084017(n)/n.
 * @author Sean A. Irvine
 */
public class A084018 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A084018() {
    super(1, new A084017(), (n, k) -> k.divide(n));
  }
}
