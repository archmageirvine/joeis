package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;

/**
 * A065839 Primes found in A065838.
 * @author Sean A. Irvine
 */
public class A065839 extends FilterSequence {

  /** Construct the sequence. */
  public A065839() {
    super(new A065838(), Z::isProbablePrime);
  }
}

