package irvine.oeis.a061;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a000.A000290;
import irvine.oeis.a028.A028839;
import irvine.oeis.a050.A050626;

/**
 * A061267 Squares whose sum of digits as well as product of digits is a nonzero square.
 * @author Sean A. Irvine
 */
public class A061267 extends IntersectionSequence {

  /** Construct the sequence. */
  public A061267() {
    super(new A000290(), new A050626(), new A028839());
  }
}
