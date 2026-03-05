package irvine.oeis.a084;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A084014 a(n) = A084013(n)/n.
 * @author Sean A. Irvine
 */
public class A084014 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A084014() {
    super(1, new A084013(), (n, k) -> k.divide(n));
  }
}
