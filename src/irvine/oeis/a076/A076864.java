package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.transform.InverseEulerTransform;
import irvine.oeis.a050.A050535;

/**
 * A076864 Number of connected loopless multigraphs with n edges.
 * @author Sean A. Irvine
 */
public class A076864 extends InverseEulerTransform {

  /** Construct this sequence. */
  public A076864() {
    super(new A050535(), 1, Z.ONE);
  }
}
