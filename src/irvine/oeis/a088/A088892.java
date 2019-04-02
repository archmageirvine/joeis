package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088892 Polynexus numbers of order 14.
 * @author Sean A. Irvine
 */
public class A088892 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088892() {
    super(new long[] {-1, 14, -91, 364, -1001, 2002, -3003, 3432, -3003, 2002, -1001, 364, -91, 14}, new long[] {0, 1, 291, 16096, 356232, 4411517, 36621423, 227095448, 1128128568, 4708376529L, 17078744419L, 55199550120L, 161993768080L, 438011626365L});
  }
}
