package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016763 a(n) = (2*n+1)^11.
 * @author Sean A. Irvine
 */
public class A016763 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016763() {
    super(new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12}, new long[] {1, 177147, 48828125, 1977326743, 31381059609L, 285311670611L, 1792160394037L, 8649755859375L, 34271896307633L, 116490258898219L, 350277500542221L, 952809757913927L});
  }
}
