package irvine.oeis.a006;

import irvine.oeis.a000.A000081;
import irvine.oeis.transform.LogarithmicTransformSequence;

/**
 * A006900 Log of g.f. for rooted trees.
 * @author Sean A. Irvine
 */
public class A006900 extends LogarithmicTransformSequence {

  /** Construct the sequence. */
  public A006900() {
    super(0, new A000081(), 1);
  }
}
