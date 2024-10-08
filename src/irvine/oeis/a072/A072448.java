package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A072448 Squares of the terms of the decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A072448 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A072448() {
    super(1, new A000796(), Z::square);
  }
}
