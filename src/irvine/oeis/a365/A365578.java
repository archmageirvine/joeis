package irvine.oeis.a365;

import irvine.oeis.transform.EulerTransform;

/**
 * A365578 Number of asteroidal triple-free graphs on n vertices.
 * @author Sean A. Irvine
 */
public class A365578 extends EulerTransform {

  /** Construct the sequence. */
  public A365578() {
    super(1, new A365796());
  }
}
