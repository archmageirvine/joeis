package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.CharacteristicFunction;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.PrependSequence;

/**
 * A050379 Number of ordered factorizations of n into members of A050376.
 * @author Sean A. Irvine
 */
public class A050379 extends DirichletInverseSequence {

  /** Construct the sequence. */
  public A050379() {
    super(new PrependSequence(new CharacteristicFunction(new A050376()) {
      @Override
      public Z next() {
        return super.next().negate();
      }
    }.skip(1), Z.ONE));
  }
}
