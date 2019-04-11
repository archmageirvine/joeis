package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.EulerTransformSequence;
import irvine.oeis.FiniteSequence;

/**
 * A005993 G.f.: <code>(1+x^2)/((1-x)^2*(1-x^2)^2)</code>.
 * @author Sean A. Irvine
 */
public class A005993 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A005993() {
    super(new FiniteSequence(Z.TWO, Z.THREE, Z.ZERO, Z.NEG_ONE), 0);
  }
}
