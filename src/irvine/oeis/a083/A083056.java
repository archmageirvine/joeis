package irvine.oeis.a083;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A083056 a(n) = 3*A083055(n)-n.
 * @author Sean A. Irvine
 */
public class A083056 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A083056() {
    super(new A083055(), (n, k) -> k.multiply(3).subtract(n));
  }
}

