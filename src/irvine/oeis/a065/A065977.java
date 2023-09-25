package irvine.oeis.a065;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a039.A039920;

/**
 * A065977 Numbers k that divide the number formed by the first k decimal digits of e (A039920(k)).
 * @author Sean A. Irvine
 */
public class A065977 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A065977() {
    super(1, 1, new A039920(), DIVISIBLE_BY_INDEX);
  }
}
