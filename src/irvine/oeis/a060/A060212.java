package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002822;

/**
 * A060212 Primes q such that 6*q-1 and 6*q+1 are twin primes. Proper subset of A002822.
 * @author Sean A. Irvine
 */
public class A060212 extends FilterSequence {

  /** Construct the sequence. */
  public A060212() {
    super(1, new A002822(), Z::isProbablePrime);
  }
}

