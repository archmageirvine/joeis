package irvine.oeis.a007;

import irvine.oeis.a000.A000108;
import irvine.oeis.transform.BinomialTransformSequence;

/**
 * A007317 Binomial transform of Catalan numbers.
 * @author Sean A. Irvine
 */
public class A007317 extends BinomialTransformSequence {

  /** Construct the sequence. */
  public A007317() {
    super(1, new A000108(), 0);
  }
}

