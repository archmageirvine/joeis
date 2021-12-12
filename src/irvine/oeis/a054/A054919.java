package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.transform.InverseEulerTransform;
import irvine.oeis.a000.A000595;

/**
 * A054919 Number of nonisomorphic connected unlabeled binary relations on n nodes.
 * @author Sean A. Irvine
 */
public class A054919 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A054919() {
    super(new A000595(), 1, Z.ONE);
  }
}
