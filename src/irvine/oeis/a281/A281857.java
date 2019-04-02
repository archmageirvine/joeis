package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281857 Numbers occurring in a curious cubic identity.
 * @author Sean A. Irvine
 */
public class A281857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281857() {
    super(new long[] {-1000000, 1111000, -112110, 1111}, new long[] {153, 165033, 166500333, 166650003333L});
  }
}
