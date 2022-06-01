package irvine.oeis.a007;

import irvine.oeis.recur.PeriodicSequence;

/**
 * A007887 a(n) = Fibonacci(n) mod 9.
 * @author Sean A. Irvine
 */
public class A007887 extends PeriodicSequence {

  /** Construct the sequence. */
  public A007887() {
    super(0, 1, 1, 2, 3, 5, 8, 4, 3, 7, 1, 8, 0, 8, 8, 7, 6, 4, 1, 5, 6, 2, 8, 1);
  }
}
