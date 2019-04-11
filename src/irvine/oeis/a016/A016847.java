package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016847 <code>(4n+3)^11</code>.
 * @author Sean A. Irvine
 */
public class A016847 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016847() {
    super(new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12}, new long[] {177147, 1977326743, 285311670611L, 8649755859375L, 116490258898219L, 952809757913927L, 5559060566555523L, 25408476896404831L, 96549157373046875L, 317475837322472439L, 929293739471222707L, 2472159215084012303L});
  }
}
