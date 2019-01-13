package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PrependSequence;

/**
 * A034825.
 * @author Sean A. Irvine
 */
public class A034825 extends PrependSequence {

  /** Construct the sequence. */
  public A034825() {
    super(new EulerTransformSequence(new A034824(), 1), Z.ONE);
  }
}
