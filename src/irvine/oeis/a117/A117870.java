package irvine.oeis.a117;

import irvine.oeis.a093.A093614;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A117870 Square board sizes for which the lights out problem does not have a unique solution (counting solutions differing only by rotation and reflection as distinct).
 * @author Sean A. Irvine
 */
public class A117870 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A117870() {
    super(new A093614(), k -> k.subtract(1));
  }
}
