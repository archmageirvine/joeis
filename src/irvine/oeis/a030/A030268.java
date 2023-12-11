package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a006.A006966;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A030268 Number of nonisomorphic connected partial lattices.
 * @author Sean A. Irvine
 */
public class A030268 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A030268() {
    super(new A006966(), 3, Z.ONE);
  }
}
