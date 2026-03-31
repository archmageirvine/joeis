package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.oeis.a005.A005809;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A394591 allocated for Vincenzo Librandi.
 * @author Sean A. Irvine
 */
public class A394591 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A394591() {
    super(1, new A005809().skip(), Functions.SOPF::z);
  }
}
