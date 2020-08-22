package irvine.oeis.a010;

import irvine.oeis.PeriodicSequence;

/**
 * A010875 a(n) = n mod 6.
 * @author Sean A. Irvine
 */
public class A010875 extends PeriodicSequence {

  /** Construct the sequence. */
  public A010875() {
    super(0, 1, 2, 3, 4, 5);
  }
}

