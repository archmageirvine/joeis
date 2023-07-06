package irvine.oeis.a000;

import irvine.oeis.a002.A002905;
import irvine.oeis.transform.EulerTransform;

/**
 * A000664 Number of graphs with n edges.
 * @author Sean A. Irvine
 */
public class A000664 extends EulerTransform {

  /** Construct the sequence. */
  public A000664() {
    super(new A002905().skip(1), 1);
  }
}
