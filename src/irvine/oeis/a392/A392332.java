package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a082.A082551;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A392332 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A392332 extends PartialSumSequence {

  /** Construct the sequence. */
  public A392332() {
    super(1, new SimpleTransformSequence(new A082551(), Z::negate));
  }
}
