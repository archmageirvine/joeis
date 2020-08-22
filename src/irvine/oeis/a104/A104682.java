package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104682 a(n) = Sum_{j=0..14} n^j.
 * @author Sean A. Irvine
 */
public class A104682 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104682() {
    super(new long[] {1, -15, 105, -455, 1365, -3003, 5005, -6435, 6435, -5005, 3003, -1365, 455, -105, 15}, new long[] {1, 15, 32767, 7174453, 357913941, 7629394531L, 94036996915L, 791260251657L, 5026338869833L, 25736391511831L, 111111111111111L, 417724816941565L, 1400638324962397L, 4265491084507563L, 11966776581370171L});
  }
}
