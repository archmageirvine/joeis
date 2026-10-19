package irvine.oeis.a005;

import irvine.oeis.a007.A007123;
import irvine.oeis.transform.EulerTransform;

/**
 * A005217 Number of unlabeled unit interval graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A005217 extends EulerTransform {

  /** Construct the sequence. */
  public A005217() {
    super(0, new A007123(), 1);
  }
}
