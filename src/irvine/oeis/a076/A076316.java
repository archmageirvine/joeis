package irvine.oeis.a076;

import irvine.oeis.transform.EulerTransform;

/**
 * A076316 Number of 4-colorable (i.e., chromatic number &lt;= 4) simple graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A076316 extends EulerTransform {

  /** Construct the sequence. */
  public A076316() {
    super(1, new A076323());
  }
}
