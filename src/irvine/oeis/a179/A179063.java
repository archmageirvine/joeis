package irvine.oeis.a179;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A179063 Number of non-attacking placements of 8 rooks on an n X n board.
 * @author Sean A. Irvine
 */
public class A179063 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179063() {
    super(1, new long[] {1, -17, 136, -680, 2380, -6188, 12376, -19448, 24310, -24310, 19448, -12376, 6188, -2380, 680, -136, 17}, new long[] {0, 0, 0, 0, 0, 0, 0, 40320, 3265920, 81648000, 1097712000, 9879408000L, 66784798080L, 363606122880L, 1669619952000L, 6678479808000L, 23828156352000L});
  }
}
