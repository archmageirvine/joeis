package irvine.oeis.a076;

import irvine.oeis.transform.EulerTransform;

/**
 * A076321 Number of 9-colorable (i.e., chromatic number &lt;= 9) simple graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A076321 extends EulerTransform {

  /** Construct the sequence. */
  public A076321() {
    super(1, new A076328());
  }
}
