package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a000.A000961;

/**
 * A024619 Numbers that are not powers of primes p^k (k &gt;= 0); complement of A000961.
 * @author Sean A. Irvine
 */
public class A024619 extends ComplementSequence {

  /** Construct the sequence. */
  public A024619() {
    super(new A000961(), Z.SIX);
  }
}
