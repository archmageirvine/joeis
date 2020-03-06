package irvine.oeis.a029;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000012;

/**
 * A029860 Euler transform of <code>4 3 2 1 1 1 1 1 1 1 ..</code>.
 * @author Sean A. Irvine
 */
public class A029860 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A029860() {
    super(new PrependSequence(new A000012(), 4, 3, 2), 0);
  }
}
