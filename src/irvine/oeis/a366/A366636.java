package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a034.A034491;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366575.
 * @author Sean A. Irvine
 */
public class A366636 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366636() {
    super(0, new A034491(), k -> Z.valueOf(Jaguar.factor(k).omega()));
  }
}

