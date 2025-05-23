package irvine.oeis.a076;

import irvine.oeis.transform.EulerTransform;

/**
 * A076320 Number of 8-colorable (i.e., chromatic number &lt;= 8) simple graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A076320 extends EulerTransform {

  /** Construct the sequence. */
  public A076320() {
    super(1, new A076327());
  }
}
