package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a034.A034524;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366575.
 * @author Sean A. Irvine
 */
public class A366687 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366687() {
    super(0, new A034524(), k -> Z.valueOf(Jaguar.factor(k).bigOmega()));
  }
}

