package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A084504 Sequence A084503 in binary.
 * @author Sean A. Irvine
 */
public class A084504 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A084504() {
    super(new A084503(), k -> new Z(k.toString(2)));
  }
}
