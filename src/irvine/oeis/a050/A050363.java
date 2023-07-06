package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a010.A010055;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A050363 Number of ordered factorizations into prime powers greater than 1.
 * @author Sean A. Irvine
 */
public class A050363 extends DirichletInverseSequence {

  /** Construct the sequence. */
  public A050363() {
    super(new PrependSequence(new SimpleTransformSequence(new A010055(), Z::negate).skip(1), Z.ONE));
  }
}
