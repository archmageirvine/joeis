package irvine.oeis.a369;
// Generated by gen_seq4.pl dirtraf at 2024-02-03 12:35

import irvine.oeis.a003.A003415;
import irvine.oeis.a046.A046316;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A369252 Arithmetic derivative applied to the numbers of the form p*q*r where p,q,r are (not necessarily distinct) odd primes.
 * @author Georg Fischer
 */
public class A369252 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A369252() {
    super(1, new A003415(), new A046316());
  }
}
