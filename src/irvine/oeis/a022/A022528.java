package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022528 Nexus numbers <code>(n+1)^12-n^12</code>.
 * @author Sean A. Irvine
 */
public class A022528 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022528() {
    super(new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12}, new long[] {1, 4095, 527345, 16245775, 227363409, 1932641711, 11664504865L, 54878189535L, 213710059745L, 717570463519L, 2138428376721L, 5777672071535L});
  }
}
