package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a066.A066829;

/**
 * A050334 Number of ordered factorizations of n into numbers with an odd number of prime divisors (prime factors counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A050334 extends DirichletInverseSequence {

  /** Construct the sequence. */
  public A050334() {
    super(new PrependSequence(new A066829() {
      @Override
      public Z next() {
        return super.next().negate();
      }
    }.skip(1), Z.ONE));
  }
}
