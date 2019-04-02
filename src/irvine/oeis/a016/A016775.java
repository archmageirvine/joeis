package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016775 (3*n)^11.
 * @author Sean A. Irvine
 */
public class A016775 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016775() {
    super(new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12}, new long[] {0, 177147, 362797056, 31381059609L, 743008370688L, 8649755859375L, 64268410079232L, 350277500542221L, 1521681143169024L, 5559060566555523L, 17714700000000000L, 50542106513726817L});
  }
}
