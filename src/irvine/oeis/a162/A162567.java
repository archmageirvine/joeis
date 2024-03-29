package irvine.oeis.a162;
// Generated by gen_seq4.pl robots/union2 at 2023-08-23 09:55

import irvine.oeis.UnionSequence;
import irvine.oeis.a048.A048891;
import irvine.oeis.a052.A052013;

/**
 * A162567 Primes p such that pi(p) divides p-1 and/or p+1, where pi(p) is the number of primes &lt;= p.
 * @author Georg Fischer
 */
public class A162567 extends UnionSequence {

  /** Construct the sequence. */
  public A162567() {
    super(1, new A048891(), new A052013());
  }
}
