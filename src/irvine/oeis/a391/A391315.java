package irvine.oeis.a391;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000108;
import irvine.oeis.a061.A061552;

/**
 * A391315 Number of 1324-avoiding permutations of [n] in which the largest element is not in the final position.
 * @author Sean A. Irvine
 */
public class A391315 extends Combiner {

  /** Construct the sequence. */
  public A391315() {
    super(1, new A061552().skip(), new A000108(), SUBTRACT);
  }
}
