package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168664 a(n) = n^7*(n^7 + 1)/2.
 * @author Sean A. Irvine
 */
public class A168664 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168664() {
    super(new long[] {1, -15, 105, -455, 1365, -3003, 5005, -6435, 6435, -5005, 3003, -1365, 455, -105, 15}, new long[] {0, 1, 8256, 2392578, 134225920, 3051796875L, 39182222016L, 339111948196L, 2199024304128L, 11438398618965L, 50000005000000L, 189874926535206L, 641959250190336L, 1968688224223903L, 5556003465485760L});
  }
}
