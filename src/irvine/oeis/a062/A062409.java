package irvine.oeis.a062;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a022.A022843;

/**
 * A062409 Numbers k such that floor(e*k) is prime.
 * @author Sean A. Irvine
 */
public class A062409 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A062409() {
    super(1, 0, new A022843(), PROBABLE_PRIME);
  }
}

