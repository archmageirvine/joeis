package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.InverseEulerTransformSequence;
import irvine.oeis.a006.A006966;

/**
 * A030268.
 * @author Sean A. Irvine
 */
public class A030268 extends InverseEulerTransformSequence {

  /** Construct the sequence. */
  public A030268() {
    super(new A006966(), 3, Z.ONE);
  }
}
