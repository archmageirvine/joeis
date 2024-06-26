package irvine.oeis.a124;
// Generated by gen_seq4.pl 2024-06-03/holos at 2024-06-03 22:35

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A124126 a(n)=(1/(3n))*sum(k=1,n,F(8k)*B(2n-2k)*binomial(2n,2k)) where F=Fibonacci numbers and B=Bernoulli numbers.
 * @author Georg Fischer
 */
public class A124126 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A124126() {
    super(1, "[0, -245025, 11987460, -22605346, 10372992, -1866219, 157376, -6594, 132, -1]", "7, 168, 5425, 199367, 7890120, 327681361, 14071534535, 618924449640", 0, 0);
  }
}
