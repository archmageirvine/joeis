package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016811 <code>(4n)^11</code>.
 * @author Sean A. Irvine
 */
public class A016811 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016811() {
    super(new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12}, new long[] {0, 4194304, 8589934592L, 743008370688L, 17592186044416L, 204800000000000L, 1521681143169024L, 8293509467471872L, 36028797018963968L, 131621703842267136L, 419430400000000000L, 1196683881290399744L});
  }
}
