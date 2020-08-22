package irvine.oeis.a029;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000012;

/**
 * A029859 Euler transform of 3 2 1 1 1 1 1 1...
 * @author Sean A. Irvine
 */
public class A029859 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A029859() {
    super(new PrependSequence(new A000012(), 3, 2), 0);
  }
}
