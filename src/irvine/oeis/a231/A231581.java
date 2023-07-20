package irvine.oeis.a231;
// manually holom/holos at 2023-07-20 14:24

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A231581 Number of nX2 0..3 arrays with no element less than a strict majority of its horizontal, vertical, diagonal and antidiagonal neighbors
 * @author Georg Fischer
 */
public class A231581 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A231581() {
    super(1, "[[0],[-2304],[-6720],[-18624],[-24608],[-24464],[-7076],[7076],[12336],[4928],[1185],[-953],[-292],[-161],[38],[6],[4],[-1]]",
      "[4, 28, 124, 602, 2776, 12922, 60720, 286047, 1335296, 6256326, 29377828, 137595239, 644951590, 3024402309, 14175895645, 66459189937]", 0);
  }
}
