package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A394633 allocated for M. F. Hasler.
 * @author Sean A. Irvine
 */
public class A394633 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A394633() {
    super(0, new A394632(), Functions.PRIME_PI::z);
  }
}
