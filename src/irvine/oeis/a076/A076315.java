package irvine.oeis.a076;

import irvine.oeis.transform.EulerTransform;

/**
 * A076315 Number of 3-colorable (i.e., chromatic number &lt;= 3) simple graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A076315 extends EulerTransform {

  /** Construct the sequence. */
  public A076315() {
    super(1, new A076322());
  }
}
