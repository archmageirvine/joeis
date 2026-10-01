package irvine.oeis.a272;
// manually 2026-09-30/countn at 2026-09-30 

import irvine.oeis.CountLessNthSequence;
import irvine.oeis.a003.A003401;

/**
 * A272370 Number of geometrically inscriptible regular polygons with fewer than 2^n + 1 sides.
 * @author Georg Fischer
 */
public class A272370 extends CountLessNthSequence {

  /** Construct the sequence */
  public A272370() {
    super(1, new A003401().skip(2), term -> true, 1, 2);
  }
}
