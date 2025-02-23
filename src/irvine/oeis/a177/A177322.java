package irvine.oeis.a177;
// Generated by gen_seq4.pl 2024-11-21.ack/holos at 2024-11-21 23:03

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A177322 Number of permutations of n copies of 1..4 with all adjacent differences &lt;= 2 in absolute value.
 * @author Georg Fischer
 */
public class A177322 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A177322() {
    super(1, "[[0],[-288, 3264,-15416, 38936,-57012, 49528,-25072, 6816,-768],[1008,-11880, 59086,-160140, 258244,-254118, 149416,-48144, 6528],[0, 0, 0, 73,-371, 707,-643, 282,-48]]", "12, 660, 51240, 4635540", 0, 0);
  }
}
