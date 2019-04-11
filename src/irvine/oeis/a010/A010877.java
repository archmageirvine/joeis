package irvine.oeis.a010;

import irvine.oeis.PeriodicSequence;

/**
 * A010877 <code>a(n) = n mod 8</code>.
 * @author Sean A. Irvine
 */
public class A010877 extends PeriodicSequence {

  /** Construct the sequence. */
  public A010877() {
    super(0, 1, 2, 3, 4, 5, 6, 7);
  }
}

