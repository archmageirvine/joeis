package irvine.oeis.a173;
// Generated by gen_seq4.pl 2023-10-12/simtraf at 2023-10-12 23:13

import irvine.oeis.PrependSequence;
import irvine.oeis.a092.A092480;

/**
 * A173771 Primes of form (4*10^n+23)/9.
 * @author Georg Fischer
 */
public class A173771 extends PrependSequence {

  /** Construct the sequence. */
  public A173771() {
    super(1, new A092480(), 3);
  }
}
