package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000088;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A001349 Number of connected graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A001349 extends InverseEulerTransform {

  /** Construct this sequence. */
  public A001349() {
    super(0, new A000088(), 1, Z.ONE);
  }
}
