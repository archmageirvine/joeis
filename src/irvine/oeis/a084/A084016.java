package irvine.oeis.a084;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A084016 a(n) = A084015(n)/n.
 * @author Sean A. Irvine
 */
public class A084016 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A084016() {
    super(1, new A084015(), (n, k) -> k.divide(n));
  }
}
