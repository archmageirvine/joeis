package irvine.oeis.a194;

import irvine.oeis.LinearRecurrence;

/**
 * A194455 a(n) = 2^n + 3n + 1.
 * @author Sean A. Irvine
 */
public class A194455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A194455() {
    super(new long[] {2, -5, 4}, new long[] {2, 6, 11});
  }
}
