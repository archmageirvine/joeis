package irvine.oeis.a034;

import irvine.oeis.transform.EulerTransformSequence;
import irvine.oeis.a318.A318590;

/**
 * A034892 Number of balanced signed graphs on n unlabeled nodes.
 * @author Sean A. Irvine
 */
public class A034892 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A034892() {
    super(new A318590(), 1);
  }
}
