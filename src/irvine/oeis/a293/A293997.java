package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293997 Number of linear chord diagrams having n chords and no chord length larger than five.
 * @author Sean A. Irvine
 */
public class A293997 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293997() {
    super(new long[] {-2880, 10656, -9936, -2136, -1536, 14576, -924, -5670, 208, -1590, -648, 495, 81, 2, 4, 3}, new long[] {1, 1, 3, 15, 105, 945, 3465, 14857, 72905, 393565, 2152693, 10317169, 49808117, 247455873, 1256019673, 6371895677L});
  }
}
