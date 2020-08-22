package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A034187 Not necessarily symmetric n X 4 crossword puzzle grids.
 * @author Sean A. Irvine
 */
public class A034187 extends LinearRecurrence {

  // WARNING: Conjectural

  /**
   * Construct the sequence.
   */
  public A034187() {
    super(
      new long[]{1, 8, -150, 195, 1041, -597, 1550, -1529, -3714, 9655, -6736, -4443, 11632, -7707, -142, 3513, -2623, 1009, -218, 24},
      new Z[]{
        Z.ONE,
        new Z("39"),
        new Z("649"),
        new Z("7943"),
        new Z("86995"),
        new Z("910667"),
        new Z("9339937"),
        new Z("94844591"),
        new Z("958363411"),
        new Z("9659847433"),
        new Z("97245624749"),
        new Z("978360244839"),
        new Z("9839915415611"),
        new Z("98949930968385"),
        new Z("994959069405031"),
        new Z("10004090931544495"),
        new Z("100586881489055547"),
        new Z("1011348141567934109"),
        new Z("10168521627634626715"),
        new Z("102238353246109535713"),
      });
  }
}

