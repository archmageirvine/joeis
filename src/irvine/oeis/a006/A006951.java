package irvine.oeis.a006;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.a008.A008965;

/**
 * A006951 Number of conjugacy classes in <code>GL(n,2)</code>.
 * @author Sean A. Irvine
 */
public class A006951 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A006951() {
    super(new A008965(), 0);
  }
}
