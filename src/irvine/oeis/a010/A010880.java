package irvine.oeis.a010;

import irvine.oeis.PeriodicSequence;

/**
 * A010880 a(n) = n mod 11.
 * @author Sean A. Irvine
 */
public class A010880 extends PeriodicSequence {

  /** Construct the sequence. */
  public A010880() {
    super(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
  }
}

