package irvine.oeis.a083;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A083051.
 * @author Sean A. Irvine
 */
public class A083117 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A083117() {
    super(1, new A083116(), (n, k) -> k.divide(n));
  }
}

