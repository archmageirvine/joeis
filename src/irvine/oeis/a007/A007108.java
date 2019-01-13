package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.LogarithmicTransformSequence;
import irvine.oeis.PrependSequence;

/**
 * A007108.
 * @author Sean A. Irvine
 */
public class A007108 extends PrependSequence {

  /** Construct the sequence. */
  public A007108() {
    super(new LogarithmicTransformSequence(new A007107(), 1), Z.ZERO);
  }
}
