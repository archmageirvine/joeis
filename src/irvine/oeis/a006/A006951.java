package irvine.oeis.a006;

import irvine.oeis.a008.A008965;
import irvine.oeis.transform.EulerTransform;

/**
 * A006951 Number of conjugacy classes in GL(n,2).
 * @author Sean A. Irvine
 */
public class A006951 extends EulerTransform {

  /** Construct the sequence. */
  public A006951() {
    super(0, new A008965(), 1);
  }
}
