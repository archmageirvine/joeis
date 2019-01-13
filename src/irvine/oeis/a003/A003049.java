package irvine.oeis.a003;

import irvine.oeis.InverseEulerTransformSequence;
import irvine.oeis.a002.A002854;

/**
 * A003049.
 * @author Sean A. Irvine
 */
public class A003049 extends InverseEulerTransformSequence {

  /** Construct the sequence. */
  public A003049() {
    super(new A002854(), 0);
    next();
  }
}
