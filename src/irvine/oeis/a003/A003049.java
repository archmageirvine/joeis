package irvine.oeis.a003;

import irvine.oeis.a002.A002854;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A003049 Number of connected Eulerian graphs with n unlabeled nodes.
 * @author Sean A. Irvine
 */
public class A003049 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A003049() {
    super(1, new A002854(), 0);
    next();
  }
}
