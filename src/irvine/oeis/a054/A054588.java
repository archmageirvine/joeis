package irvine.oeis.a054;

import irvine.oeis.SkipSequence;
import irvine.oeis.a058.A058054;

/**
 * A054588 Length of gap between consecutive primes containing n!.
 * @author Sean A. Irvine
 */
public class A054588 extends SkipSequence {

  /** Construct the sequence. */
  public A054588() {
    super(new A058054(), 1);
  }
}
