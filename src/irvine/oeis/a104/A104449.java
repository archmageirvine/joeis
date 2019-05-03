package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104449 The Pibonacci numbers <code>(a Fibonacci-type</code> sequence): each term is the sum of the two previous terms.
 * @author Sean A. Irvine
 */
public class A104449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104449() {
    super(new long[] {1, 1}, new long[] {3, 1});
  }
}
