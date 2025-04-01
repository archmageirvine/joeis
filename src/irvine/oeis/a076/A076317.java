package irvine.oeis.a076;

import irvine.oeis.transform.EulerTransform;

/**
 * A076317 Number of 5-colorable (i.e., chromatic number &lt;= 5) simple graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A076317 extends EulerTransform {

  /** Construct the sequence. */
  public A076317() {
    super(1, new A076324());
  }
}
