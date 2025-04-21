package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.oeis.a002.A002113;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A061913.
 * @author Sean A. Irvine
 */
public class A076889 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A076889() {
    super(1, new A002113().skip(), Functions.ALIQUOT::z);
  }
}
