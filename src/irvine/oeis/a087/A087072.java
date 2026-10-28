package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a050.A050936;

/**
 * A087072 Numbers having no partitions into a sum of two or more consecutive primes.
 * @author Sean A. Irvine
 */
public class A087072 extends ComplementSequence {

  /** Construct the sequence. */
  public A087072() {
    super(1, Z.ONE, new A050936());
  }
}

