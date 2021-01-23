package irvine.oeis.a003;

import irvine.oeis.InverseEulerTransform;
import irvine.oeis.a002.A002854;

/**
 * A003049 Number of connected Eulerian graphs with n unlabeled nodes.
 * @author Sean A. Irvine
 */
public class A003049 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A003049() {
    super(new A002854(), 0);
    next();
  }
}
