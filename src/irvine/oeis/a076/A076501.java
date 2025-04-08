package irvine.oeis.a076;

import irvine.oeis.DeadSequence;

/**
 * A076501 a(n) is the smallest (prime) integer such that the sequence {p_1, p_2, ..., p_n = a(n)} consists entirely of primes, where p_i = floor(a(n)^(i/n)).
 * @author Sean A. Irvine
 */
public class A076501 extends DeadSequence {

  /** Construct the sequence. */
  public A076501() {
    super(1);
  }
}
