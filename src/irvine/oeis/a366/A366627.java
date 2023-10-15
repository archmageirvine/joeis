package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a062.A062394;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366575.
 * @author Sean A. Irvine
 */
public class A366627 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366627() {
    super(0, new A062394(), k -> Z.valueOf(Jaguar.factor(k).omega()));
  }
}

