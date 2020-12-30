package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.InverseEulerTransform;
import irvine.oeis.a000.A000666;

/**
 * A054921 Number of connected unlabeled symmetric relations (graphs with loops) having n nodes.
 * @author Sean A. Irvine
 */
public class A054921 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A054921() {
    super(new A000666(), 1, Z.ONE);
  }
}
