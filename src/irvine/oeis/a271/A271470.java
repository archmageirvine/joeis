package irvine.oeis.a271;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A271470 a(n)-th chiliagonal (or 1000-gonal) number is square.
 * @author Sean A. Irvine
 */
public class A271470 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271470() {
    super(new long[] {1, -1, 0, -80640398, 80640398, 0, 1}, new long[] {1, 2241, 18395521, 22005481, 180674890281L, 1483422094617961L, 1774530705782041L});
  }
}
