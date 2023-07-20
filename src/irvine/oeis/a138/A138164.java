package irvine.oeis.a138;
// manually holom/holos at 2023-07-20 14:24

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A138164 Row sums of Riordan array (c(-x^2),xc(-x^2)^2)^(-1) where c(x) is the g.f. of A000108.
 * @author Georg Fischer
 */
public class A138164 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A138164() {
    super(0, "[[0],[2160,-8178, 7419,-2538, 297],[-6000, 23838,-22041, 7614,-891],[720,-5898, 6379,-2294, 253],[480,-1272, 1392,-732, 132],[0, 192,-392, 244,-44]]", "[1, 1, 2, 4, 9]", 0);
  }
}
