package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A084514 Sequence A084513 in binary.
 * @author Sean A. Irvine
 */
public class A084514 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A084514() {
    super(new A084513(), k -> new Z(k.toString(2)));
  }
}
