package irvine.oeis.a274;
// Generated by gen_seq4.pl build/holos at 2022-07-13 16:28

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A274671 Diagonal of the rational function 1/(1 - x - y - z - x y + x z + y z - x y z).
 * @author Georg Fischer
 */
public class A274671 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A274671() {
    super(0, "[[0],[100,-248, 173,-37],[1510,-4267, 3672,-999],[-330, 1383,-1881, 703],[0, 0, 62,-37]]", "1", 0);
  }
}
