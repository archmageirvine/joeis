package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.EulerTransformSequence;
import irvine.oeis.FiniteSequence;

/**
 * A005994 Alkane <code>(or paraffin)</code> numbers <code>l(7,n)</code>.
 * @author Sean A. Irvine
 */
public class A005994 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A005994() {
    super(new FiniteSequence(Z.THREE, Z.THREE, Z.ZERO, Z.NEG_ONE), 0);
  }
}
