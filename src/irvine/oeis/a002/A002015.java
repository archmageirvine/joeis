package irvine.oeis.a002;

import irvine.oeis.PeriodicSequence;

/**
 * A002015 <code>a(n) = n^2</code> reduced <code>mod 100</code>.
 * @author Sean A. Irvine
 */
public class A002015 extends PeriodicSequence {

  /** Construct the sequence. */
  public A002015() {
    super(0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 0, 21, 44, 69, 96, 25, 56, 89, 24, 61, 0, 41, 84, 29, 76, 25, 76, 29, 84, 41, 0, 61, 24, 89, 56, 25, 96, 69, 44, 21, 0, 81, 64, 49, 36, 25, 16, 9, 4, 1);
  }
}
