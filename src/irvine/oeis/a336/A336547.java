package irvine.oeis.a336;
// Generated by gen_seq4.pl 2024-09-20.ack/parmof3 at 2024-09-20 18:07

import irvine.oeis.a329.A329963;

/**
 * A336547 Numbers k such that for 1 &lt;= i &lt; j &lt;= h, all sigma(p_i^e_i), sigma(p_j^e_j) are pairwise coprime, when k = p_1^e_1 * ... * p_h^e_h, where each p_i^e_i is the maximal power of prime p_i dividing k.
 * @author Georg Fischer
 */
public class A336547 extends A329963 {

  /** Construct the sequence. */
  public A336547() {
    super(1, 1, new A336546());
  }
}
