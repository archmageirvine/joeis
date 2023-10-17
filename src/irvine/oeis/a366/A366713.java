package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a178.A178248;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366575.
 * @author Sean A. Irvine
 */
public class A366713 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366713() {
    super(0, new A178248(), k -> Z.valueOf(Jaguar.factor(k).bigOmega()));
  }
}

