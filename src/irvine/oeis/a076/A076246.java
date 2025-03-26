package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A076246 Totients of those numbers at which values of A051547 increase: in these consecutive terms new prime powers arise, i.e., which did not occur in neither of preceding terms.
 * @author Sean A. Irvine
 */
public class A076246 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A076246() {
    super(1, new A076245().skip(), Functions.PHI::z);
  }
}
