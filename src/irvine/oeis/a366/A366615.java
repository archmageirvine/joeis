package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a034.A034474;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366575.
 * @author Sean A. Irvine
 */
public class A366615 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366615() {
    super(0, new A034474(), k -> Z.valueOf(Jaguar.factor(k).omega()));
  }
}

