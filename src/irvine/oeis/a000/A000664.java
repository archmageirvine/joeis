package irvine.oeis.a000;

import irvine.oeis.transform.EulerTransformSequence;
import irvine.oeis.a002.A002905;

/**
 * A000664 Number of graphs with n edges.
 * @author Sean A. Irvine
 */
public class A000664 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A000664() {
    super(new A002905(), 1);
  }
}
