package irvine.oeis.a240;
// Generated by gen_seq4.pl 2024-02-26/holos at 2024-02-26 19:18

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A240586 Expansion of (((8-8 / sqrt(1-8*x)) / (2*sqrt(8*x+2*sqrt(1-8*x)+2))+4 / sqrt(1-8*x))*((x*(sqrt(8*x+2*sqrt(1-8*x)+2)-sqrt(1-8*x)-1))-4*x^2)) / (sqrt(8*x+2*sqrt(1-8*x)+2)-sqrt(1-8*x)-1)^2.
 * @author Georg Fischer
 */
public class A240586 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A240586() {
    super(1, "[[0], [950400, -890880, 306560, -46080, 2560], [535680, -529440, 194880, -31680, 1920], [-110280, 119944, -47408, 7976, -472], [4800, -7104, 4136, -1164, 136], [-60, 210, -270, 150, -30], [0, -2, 7, -7, 2]]", "1, 4", 0, 0);
  }
}
