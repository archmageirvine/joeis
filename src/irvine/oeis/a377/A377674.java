package irvine.oeis.a377;

import irvine.math.function.Functions;
import irvine.oeis.a066.A066068;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A377672.
 * @author Sean A. Irvine
 */
public class A377674 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A377674() {
    super(1, new A066068().skip(), Functions.PHI::z);
  }
}
