package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099843 A transform of the Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A099843 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099843() {
    super(new long[] {1, -4}, new long[] {1, -5});
  }
}
