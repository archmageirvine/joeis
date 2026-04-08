package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.oeis.a001.A001449;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A394592 allocated for Vincenzo Librandi.
 * @author Sean A. Irvine
 */
public class A394592 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A394592() {
    super(1, new A001449().skip(), Functions.SOPF::z);
  }
}
