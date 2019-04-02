package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.EulerTransformSequence;
import irvine.oeis.FiniteSequence;

/**
 * A005994 Alkane (or paraffin) numbers l(7,n).
 * @author Sean A. Irvine
 */
public class A005994 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A005994() {
    super(new FiniteSequence(Z.THREE, Z.THREE, Z.ZERO, Z.NEG_ONE), 0);
  }
}
