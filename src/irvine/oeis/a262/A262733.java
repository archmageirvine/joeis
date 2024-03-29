package irvine.oeis.a262;
// Generated by gen_seq4.pl rectoproc/holos5 at 2022-08-12 18:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A262733 a(n) = (1/n!) * (7*n)!/(7*n/2)! * (5*n/2)!/(5*n)!.
 * sumrecursion(binomial(7*n,i)*binomial(6*n-i-1,n-i),i,a(n));
 * @author Georg Fischer
 */
public class A262733 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A262733() {
    super(0, "[[0],[-540540, 6857256,-27899620, 50824368,-45647812, 19765032,-3294172],[0],[0,-945, 8445,-23750, 28750,-15625, 3125]]", "1, 12, 286, 7680", 0);
  }
}
