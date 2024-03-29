package irvine.oeis.a063;
// Generated by gen_seq4.pl mult at 2022-07-21 21:19

import irvine.oeis.MultiplicativeSequence;

/**
 * A063659 The number of integers m in [1..n] for which gcd(m,n) is not divisible by a square greater than 1.
 * @author Georg Fischer
 */
public class A063659 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A063659() {
    super(1, (p, e) -> e == 1 ? p : p.pow(e).subtract(p.pow(e - 2)));
  }
}
