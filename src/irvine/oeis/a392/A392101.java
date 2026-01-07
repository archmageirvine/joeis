package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A392101 allocated for Rhys Feltman.
 * @author Sean A. Irvine
 */
public class A392101 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A392101() {
    super(1, new A392102(), Z::sqrt);
  }
}

