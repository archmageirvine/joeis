package irvine.oeis.a010;

import irvine.oeis.recur.PeriodicSequence;

/**
 * A010873 a(n) = n mod 4.
 * @author Sean A. Irvine
 */
public class A010873 extends PeriodicSequence {

  /** Construct the sequence. */
  public A010873() {
    super(0, 1, 2, 3);
  }
}

