package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016799.
 * @author Sean A. Irvine
 */
public class A016799 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016799() {
    super(new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12}, new long[] {2048, 48828125, 8589934592L, 285311670611L, 4049565169664L, 34271896307633L, 204800000000000L, 952809757913927L, 3670344486987776L, 12200509765705829L, 36028797018963968L, 96549157373046875L});
  }
}
