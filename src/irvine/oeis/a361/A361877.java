package irvine.oeis.a361;
// Generated by gen_seq4.pl binomin/holos at 2023-05-08 14:44

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A361877 a(n) = binomial(2*n, n) * binomial(2*n - 1, n).
 * @author Georg Fischer
 */
public class A361877 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A361877() {
    super(0, "[[0],[-4,16,-16],[0,0,1]]", "[1,2]", 0);
  }
}
