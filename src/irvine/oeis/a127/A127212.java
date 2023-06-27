package irvine.oeis.a127;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A127212 a(n) = 5^n*Lucas(n), where Lucas = A000204.
 * @author Sean A. Irvine
 */
public class A127212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127212() {
    super(1, new long[] {25, 5}, new long[] {5, 75});
  }
}
