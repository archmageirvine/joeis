package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A068950 Digital roots of A068809.
 * @author Sean A. Irvine
 */
public class A068950 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A068950() {
    super(1, new A068809(), k -> Functions.DIGIT_SUM_ROOT.z(k));
  }
}

