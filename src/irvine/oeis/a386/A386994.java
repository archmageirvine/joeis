package irvine.oeis.a386;

import irvine.oeis.a000.A000045;

/**
 * A386994 Number of 2-dense sublists of divisors of the n-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A386994 extends A386993 {

  /** Construct the sequence. */
  public A386994() {
    super(0, new A000045());
  }
}

