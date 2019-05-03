package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056571 Fourth power of Fibonacci numbers <code>A000045</code>.
 * @author Sean A. Irvine
 */
public class A056571 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056571() {
    super(new long[] {1, -5, -15, 15, 5}, new long[] {0, 1, 1, 16, 81});
  }
}
