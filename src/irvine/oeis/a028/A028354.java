package irvine.oeis.a028;

import irvine.oeis.recur.PeriodicSequence;

/**
 * A028354 How the astronomical clock ("Orloj") in Prague strikes the hours (digits follow 12343212343... (A028356), n-th group adds to n).
 * @author Sean A. Irvine
 */
public class A028354 extends PeriodicSequence {

  /** Construct the sequence. */
  public A028354() {
    super(1, 2, 3, 4, 32, 123, 43, 2123, 432, 1234, 32123, 43212, 34321, 23432, 123432, 1234321, 2343212, 3432123, 4321234, 32123432, 123432123, 43212343, 2123432123, 432123432);
    setOffset(1);
  }
}

