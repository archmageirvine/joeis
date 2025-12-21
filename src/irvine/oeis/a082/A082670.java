package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.oeis.a006.A006512;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A082670 a(n) = p(n)!/2 where p(n) is the upper member of n-th pair of twin primes.
 * @author Sean A. Irvine
 */
public class A082670 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A082670() {
    super(1, new A006512(), p -> Functions.FACTORIAL.z(p).divide2());
  }
}
