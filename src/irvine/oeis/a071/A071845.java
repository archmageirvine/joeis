package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A071845 Primes p such that the number of ones in the binary representation of p^p is prime.
 * @author Sean A. Irvine
 */
public class A071845 extends FilterSequence {

  /** Construct the sequence. */
  public A071845() {
    super(1, new A000040(), p -> Z.valueOf(p.pow(p).bitCount()).isProbablePrime());
  }
}
