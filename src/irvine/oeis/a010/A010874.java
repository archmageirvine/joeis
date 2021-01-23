package irvine.oeis.a010;

import irvine.oeis.PeriodicSequence;

/**
 * A010874 a(n) = n mod 5.
 * @author Sean A. Irvine
 */
public class A010874 extends PeriodicSequence {

  /** Construct the sequence. */
  public A010874() {
    super(0, 1, 2, 3, 4);
  }
}

