package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.oeis.a008.A008454;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A391601 allocated for Bruce Nye.
 * @author Sean A. Irvine
 */
public class A391601 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A391601() {
    super(0, new A008454(), Functions.NEXT_PRIME::z);
  }
}
