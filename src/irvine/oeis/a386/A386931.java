package irvine.oeis.a386;

import irvine.math.z.Z;
import irvine.oeis.a076.A076115;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A076115 Squares (or 0) from A076114.
 * @author Sean A. Irvine
 */
public class A386931 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A386931() {
    super(1, new A076115(), Z::sqrt);
  }
}
