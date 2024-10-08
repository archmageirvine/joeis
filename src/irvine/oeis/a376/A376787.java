package irvine.oeis.a376;
// Generated by gen_seq4.pl 2024-10-06.ack/holos at 2024-10-06 22:12

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A376787 Expansion of (1 - x^2 + x^3)/((1 - x^2 + x^3)^2 - 4*x^3).
 * (x^3-x^2+1)/((x^3-x^2+1)^2-4*x^3)
 * @author Georg Fischer
 */
public class A376787 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A376787() {
    super(0, "[[0],[-6,1],[16,-3],[-14,3],[16,-2],[4,-2],[-8,3],[-6,-1],[4,-3],[0],[0,1]]", "1,0,1,3,1,10,6,21,36,43,127", 0, 0);
  }
}
