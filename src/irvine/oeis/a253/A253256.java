package irvine.oeis.a253;
// Generated by gen_seq4.pl holos at 2024-02-09 22:47

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A253256 G.f. satisfies: A(x) = (1 - x^3*A(x)^6) / (1 - x*A(x)^2)^2.
 * G.f.A(x) satisfies -A+(-A^6*x^3+1)/(-A^2*x+1)^2=0
 * @author Georg Fischer
 */
public class A253256 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A253256() {
    super(0, "[[0], [-385560, 842724, -719100, 299880, -61200, 4896], [-877320, 2082228, -1947120, 896940, -203520, 18192], [37200, -124682, 166815, -112520, 38625, -5438], [0, 384, -1650, 2520, -1770, 516], [0, -4, 0, 20, 0, -16]]", "1, 2, 11, 79, 647, 5727", 0, 0);
  }
}
