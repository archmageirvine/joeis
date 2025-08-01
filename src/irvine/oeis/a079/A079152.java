package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A079152 Primes p such that either p-1 or p+1 has at most 3 prime factors, counted with multiplicity; i.e., primes p such that either bigomega(p-1) &lt;= 3 or bigomega(p+1) &lt;= 3, where bigomega(n) = A001222(n).
 * @author Sean A. Irvine
 */
public class A079152 extends FilterSequence {

  /** Construct the sequence. */
  public A079152() {
    super(new A000040(), k -> Functions.BIG_OMEGA.l(k.subtract(1)) <= 3 || Functions.BIG_OMEGA.l(k.add(1)) <= 3);
  }
}

