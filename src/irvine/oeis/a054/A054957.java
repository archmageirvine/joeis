package irvine.oeis.a054;

import irvine.oeis.a007.A007080;
import irvine.oeis.transform.LogarithmicTransformSequence;

/**
 * A054957 Number of labeled connected Eulerian digraphs with n nodes.
 * @author Sean A. Irvine
 */
public class A054957 extends LogarithmicTransformSequence {

  /** Construct the sequence. */
  public A054957() {
    super(new A007080(), 0);
  }
}
