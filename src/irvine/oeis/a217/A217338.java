package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217338 Number of inequivalent ways to color <code>a 4</code> X 4 checkerboard using at most n colors allowing rotations and reflections.
 * @author Sean A. Irvine
 */
public class A217338 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217338() {
    super(new long[] {1, -17, 136, -680, 2380, -6188, 12376, -19448, 24310, -24310, 19448, -12376, 6188, -2380, 680, -136, 17}, new long[] {0, 1, 8548, 5398083, 537157696, 19076074375L, 352654485156L, 4154189102413L, 35184646816768L, 231628411446741L, 1250002537502500L, 5743722797690911L, 23110548002468928L, 83177110918426603L, 272244240093265636L, 821051189587805625L, 2305843285702230016L});
  }
}
