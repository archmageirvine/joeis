package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.InverseEulerTransformSequence;

/**
 * A004108 Number of n-node unlabeled connected graphs without endpoints.
 * @author Sean A. Irvine
 */
public class A004108 extends InverseEulerTransformSequence {

  /** Construct the sequence. */
  public A004108() {
    super(new A004110(), 1, Z.ONE);
  }
}
