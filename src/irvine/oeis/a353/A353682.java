package irvine.oeis.a353;
// Generated by gen_seq4.pl 2023-10-21/pairtra at 2023-10-22 21:59

import irvine.oeis.transform.PairTransformSequence;

/**
 * A353682 a(n) = 1 if phi(sigma(n)) &gt;= phi(n), otherwise 0.
 * @author Georg Fischer
 */
public class A353682 extends PairTransformSequence {

  /** Construct the sequence. */
  public A353682() {
    super(1, new A353637(), new A353681(), (n, u, v) -> u.add(v));
  }
}
