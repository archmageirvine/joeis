package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271115 Numbers whose square is a chiliagonal (or <code>1000-gonal)</code> number.
 * @author Sean A. Irvine
 */
public class A271115 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271115() {
    super(new long[] {-1, 0, 0, 80640398, 0, 0}, new long[] {1, 50049, 410924801, 491565199, 4035971329551L, 33137139500710799L});
  }
}
