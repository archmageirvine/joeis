package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016866 (5n+1)^6.
 * @author Sean A. Irvine
 */
public class A016866 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016866() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 46656, 1771561, 16777216, 85766121, 308915776, 887503681});
  }
}
