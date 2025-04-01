package irvine.oeis.a076;

import irvine.oeis.transform.EulerTransform;

/**
 * A076318 Number of 6-colorable (i.e., chromatic number &lt;= 6) simple graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A076318 extends EulerTransform {

  /** Construct the sequence. */
  public A076318() {
    super(1, new A076325());
  }
}
