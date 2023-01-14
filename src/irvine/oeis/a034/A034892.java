package irvine.oeis.a034;

import irvine.oeis.SkipSequence;
import irvine.oeis.a318.A318590;
import irvine.oeis.transform.EulerTransform;

/**
 * A034892 Number of balanced signed graphs on n unlabeled nodes.
 * @author Sean A. Irvine
 */
public class A034892 extends EulerTransform {

  /** Construct the sequence. */
  public A034892() {
    super(0, new SkipSequence(new A318590(), 1), 1);
  }
}
