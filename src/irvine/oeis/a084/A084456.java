package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A084456 Sequence A084457 in binary.
 * @author Sean A. Irvine
 */
public class A084456 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A084456() {
    super(1, new A084457(), k -> new Z(k.toString(2)));
  }
}
