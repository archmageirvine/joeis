package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a062.A062396;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366575.
 * @author Sean A. Irvine
 */
public class A366664 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366664() {
    super(0, new A062396(), k -> Z.valueOf(Jaguar.factor(k).omega()));
  }
}

