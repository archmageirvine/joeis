package irvine.oeis.a029;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000012;

/**
 * A029861 Euler transform of 5 4 3 2 1 1 1 1 1 1 1 ...
 * @author Sean A. Irvine
 */
public class A029861 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A029861() {
    super(new PrependSequence(new A000012(), 5, 4, 3, 2), 0);
  }
}
