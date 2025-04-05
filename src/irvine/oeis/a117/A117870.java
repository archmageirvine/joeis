package irvine.oeis.a117;

import irvine.oeis.a093.A093614;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A072123.
 * @author Sean A. Irvine
 */
public class A117870 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A117870() {
    super(new A093614(), k -> k.subtract(1));
  }
}
