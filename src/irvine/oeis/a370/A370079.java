package irvine.oeis.a370;
// Generated by gen_seq4.pl dirtraf at 2024-02-27 20:59

import irvine.oeis.a005.A005361;
import irvine.oeis.a350.A350389;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A370079 The product of the odd exponents of the prime factorization of n.
 * @author Georg Fischer
 */
public class A370079 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A370079() {
    super(1, new A005361(), new A350389());
  }
}
