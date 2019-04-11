package irvine.oeis.a010;

import irvine.oeis.PeriodicSequence;

/**
 * A010873 <code>a(n) = n mod 4</code>.
 * @author Sean A. Irvine
 */
public class A010873 extends PeriodicSequence {

  /** Construct the sequence. */
  public A010873() {
    super(0, 1, 2, 3);
  }
}

