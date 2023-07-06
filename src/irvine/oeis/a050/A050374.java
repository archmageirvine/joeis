package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005171;

/**
 * A050374 Number of ordered factorizations of n into composite factors.
 * @author Sean A. Irvine
 */
public class A050374 extends DirichletInverseSequence {

  /** Construct the sequence. */
  public A050374() {
    super(new PrependSequence(new A005171() {
      @Override
      public Z next() {
        return super.next().negate();
      }
    }.skip(1), Z.ONE));
  }
}
