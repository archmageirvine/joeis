package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A074598.
 * @author Sean A. Irvine
 */
public class A075159 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A075159() {
    super(1, new A075157(), Z.ONE::add);
  }
}
