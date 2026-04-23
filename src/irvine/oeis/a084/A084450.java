package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A084450 Sequence A084451 in binary.
 * @author Sean A. Irvine
 */
public class A084450 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A084450() {
    super(0, new A084451(), k -> new Z(k.toString(2)));
  }
}
