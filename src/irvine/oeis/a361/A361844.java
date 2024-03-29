package irvine.oeis.a361;
// Generated by gen_seq4.pl holgrep/holos at 2023-05-08 18:43

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A361844 Expansion of 1/(1 - 9*x*(1-x)^2)^(1/3).
 * @author Georg Fischer
 */
public class A361844 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A361844() {
    super(0, "[[0],[-18,9],[24,-18],[-6,9],[0,-1]]", "1,3,12,57,297,1629,9216,53217,311796", 0);
  }
}
