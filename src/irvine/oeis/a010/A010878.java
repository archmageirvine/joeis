package irvine.oeis.a010;

import irvine.oeis.PeriodicSequence;

/**
 * A010878 a(n) = n mod 9.
 * @author Sean A. Irvine
 */
public class A010878 extends PeriodicSequence {

  /** Construct the sequence. */
  public A010878() {
    super(0, 1, 2, 3, 4, 5, 6, 7, 8);
  }
}

