package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;

/**
 * A065831 Primes found in A065830.
 * @author Sean A. Irvine
 */
public class A065831 extends FilterSequence {

  /** Construct the sequence. */
  public A065831() {
    super(new A065830(), Z::isProbablePrime);
  }
}

