package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a052.A052539;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366575.
 * @author Sean A. Irvine
 */
public class A366605 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366605() {
    super(0, new A052539(), k -> Z.valueOf(Jaguar.factor(k).omega()));
  }
}

