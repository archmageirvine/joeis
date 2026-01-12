package irvine.oeis.a083;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A083117 Smallest k such that k*n contains a single digit with multiplicity, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A083117 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A083117() {
    super(1, new A083116(), (n, k) -> k.divide(n));
  }
}

