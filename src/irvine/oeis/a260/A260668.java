package irvine.oeis.a260;
// Generated by gen_seq4.pl 2023-12-02/holos at 2023-12-03 21:34

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A260668 Number of binary words of length n such that for every prefix the number of occurrences of subword 101 is larger than or equal to the number of occurrences of subword 010.
 * @author Georg Fischer
 */
public class A260668 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A260668() {
    super(0, "[[0],[-11176, 5508,-940, 56],[26884,-13652, 2364,-140],[-18884, 10590,-1894, 112],[3042,-1312, 126],[448,-2500, 716,-56],[680, 1441,-444, 35],[-340,-247, 86,-7]]", "1, 2, 4, 7, 13, 24", 0);
  }
}
