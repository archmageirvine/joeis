package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168663 a(n) = n^7*(n^6 + 1)/2.
 * @author Sean A. Irvine
 */
public class A168663 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168663() {
    super(new long[] {-1, 14, -91, 364, -1001, 2002, -3003, 3432, -3003, 2002, -1001, 364, -91, 14}, new long[] {0, 1, 4160, 798255, 33562624, 610390625, 6530486976L, 48444916975L, 274878955520L, 1270935305649L, 5000005000000L, 17261365815551L, 53496620605440L, 151437584670385L});
  }
}
