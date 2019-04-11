package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022522 Nexus numbers <code>(n+1)^6-n^6</code>.
 * @author Sean A. Irvine
 */
public class A022522 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022522() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 63, 665, 3367, 11529, 31031});
  }
}
