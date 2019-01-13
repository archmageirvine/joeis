package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103115.
 * @author Sean A. Irvine
 */
public class A103115 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103115() {
    super(new long[] {1, -3, 3}, new long[] {-1, -1, 11});
  }
}
