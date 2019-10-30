package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.InverseEulerTransformSequence;
import irvine.oeis.a050.A050535;

/**
 * A076864 Number of connected multigraphs with n edges.
 * @author Sean A. Irvine
 */
public class A076864 extends InverseEulerTransformSequence {

  /** Construct this sequence. */
  public A076864() {
    super(new A050535(), 1, Z.ONE);
  }
}
