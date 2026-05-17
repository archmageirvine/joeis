package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.oeis.a004.A004381;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A395603 allocated for Vincenzo Librandi.
 * @author Sean A. Irvine
 */
public class A395603 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A395603() {
    super(1, new A004381().skip(), Functions.SOPF::z);
  }
}
