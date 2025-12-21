package irvine.oeis.a082;

import irvine.oeis.a006.A006512;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A082669 a(n) = p(n)*(p(n)-1)/2 where p(n) = upper member of n-th pair of twin primes.
 * @author Sean A. Irvine
 */
public class A082669 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A082669() {
    super(1, new A006512(), p -> p.multiply(p.subtract(1)).divide2());
  }
}
