package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a024.A024140;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366575.
 * @author Sean A. Irvine
 */
public class A366708 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366708() {
    super(1, new A024140().skip(), k -> Z.valueOf(Jaguar.factor(k).bigOmega()));
  }
}

