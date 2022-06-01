package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131527 a(n) = 4*(n^1 + 1!)*(n^2 + 2!)*(n^3 + 3!)*(n^4 + 4!)*(n^5 + 5!)/5!.
 * @author Sean A. Irvine
 */
public class A131527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131527() {
    super(new long[] {-1, 16, -120, 560, -1820, 4368, -8008, 11440, -12870, 11440, -8008, 4368, -1820, 560, -120, 16}, new long[] {1152, 4235, 51072, 1844766, 67267200, 1489787937, 20516082048L, 194830108540L, 1389727430784L, 7923082634775L, 37759956198272L, 155476758621786L, 566979054415488L, 1866434208254637L, 5629739963760000L, 15745829707255032L});
  }
}
