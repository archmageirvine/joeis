package irvine.oeis.a383;

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a098.A098098;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A383405 allocated for Omar E. Pol.
 * @author Sean A. Irvine
 */
public class A383405 extends PartialSumSequence {

  /** Construct the sequence. */
  public A383405() {
    super(0, new SimpleTransformSequence(new A098098(), Z.SIX::multiply));
  }
}

