package irvine.oeis.a066;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a018.A018804;

/**
 * A066862 Numbers k such that k divides Sum_{i=1..k} gcd(k,i) = A018804(k).
 * @author Sean A. Irvine
 */
public class A066862 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A066862() {
    super(1, 1, new A018804(), DIVISIBLE_BY_INDEX);
  }
}
