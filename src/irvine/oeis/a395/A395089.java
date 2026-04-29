package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A395089 allocated for A.H.M. Smeets.
 * @author Sean A. Irvine
 */
public class A395089 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A395089() {
    super(new A395088(), Z.ONE::subtract);
  }
}
