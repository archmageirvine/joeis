package irvine.oeis.a382;
// Generated by gen_seq4.pl 2025-03-31.ack/holos at 2025-03-31 23:38

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A382474 a(n) = Sum_{k=0..n} binomial(k+7,7) * binomial(2*k,2*n-2*k).
 * @author Georg Fischer
 */
public class A382474 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A382474() {
    super(0, "[[0],[119700, 43551, 5918, 356, 8],[-143262,-56778,-8644,-600,-16],[57078, 3797,-1830,-244,-8],[10710,-4418,-2708,-376,-16],[0,-969, 430, 132, 8]]", "1", 0, 0);
  }
}
