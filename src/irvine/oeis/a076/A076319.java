package irvine.oeis.a076;

import irvine.oeis.transform.EulerTransform;

/**
 * A076319 Number of 7-colorable (i.e., chromatic number &lt;= 7) simple graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A076319 extends EulerTransform {

  /** Construct the sequence. */
  public A076319() {
    super(1, new A076326());
  }
}
