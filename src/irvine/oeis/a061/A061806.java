package irvine.oeis.a061;

import irvine.oeis.FilterPositionSequence;

/**
 * A061806 Numbers n such that the iterative cycle: n -&gt; sum of digits of n^2 has only three distinct elements.
 * @author Sean A. Irvine
 */
public class A061806 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A061806() {
    super(1, 0, new A061903(), k -> k.longValue() == 3);
  }
}

