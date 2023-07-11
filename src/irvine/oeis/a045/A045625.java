package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a005.A005418;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A045625 Number of n-bead black-white reversible strings with fundamental period n.
 * @author Sean A. Irvine
 */
public class A045625 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A045625() {
    super(0, new A005418(), 1, Z.ONE);
  }
}
