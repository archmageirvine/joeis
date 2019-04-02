package irvine.oeis.a294;

import irvine.oeis.LinearRecurrence;

/**
 * A294344 a(n) = ((-9*n + 82)*10^n - 1)/81.
 * @author Sean A. Irvine
 */
public class A294344 extends LinearRecurrence {

  /** Construct the sequence. */
  public A294344() {
    super(new long[] {100, -120, 21}, new long[] {1, 9, 79});
  }
}
