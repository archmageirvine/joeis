package irvine.oeis.a382;

import irvine.oeis.transform.EulerTransform;

/**
 * A003094.
 * @author Sean A. Irvine
 */
public class A382181 extends EulerTransform {

  /** Construct the sequence. */
  public A382181() {
    super(0, new A382180().skip(), 1);
  }
}
