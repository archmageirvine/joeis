package irvine.oeis.a084;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A084023 a(n) = A084022(n)/n.
 * @author Sean A. Irvine
 */
public class A084023 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A084023() {
    super(1, new A084022(), (n, k) -> k.divide(n));
  }
}
