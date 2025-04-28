package irvine.oeis.a051;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A051492 Continued fraction for Otter's rooted tree constant: lim_{n-&gt;inf} A000081(n+1)/A000081(n).
 * @author Sean A. Irvine
 */
public class A051492 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A051492() {
    super(0, new A051491());
  }
}
