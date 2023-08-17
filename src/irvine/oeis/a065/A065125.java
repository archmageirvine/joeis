package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000396;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A065125 Numbers n such that the sums of the odd and even aliquot parts of n both divide n.
 * @author Sean A. Irvine
 */
public class A065125 extends PrependSequence {

  /** Construct the sequence. */
  public A065125() {
    super(1, new SimpleTransformSequence(new A000396(), Z::multiply2), 4);
  }
}

