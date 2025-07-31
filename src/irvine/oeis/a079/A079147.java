package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A079147 Primes p such that p+1 has at most 2 prime factors, counted with multiplicity; i.e., primes p such that bigomega(p+1) = A001222(p+1) &lt;= 2.
 * @author Sean A. Irvine
 */
public class A079147 extends FilterSequence {

  /** Construct the sequence. */
  public A079147() {
    super(new A000040(), k -> Functions.BIG_OMEGA.l(k.add(1)) <= 2);
  }
}

