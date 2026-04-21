package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A084524 Sequence A084523 in binary.
 * @author Sean A. Irvine
 */
public class A084524 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A084524() {
    super(new A084523(), k -> new Z(k.toString(2)));
  }
}
