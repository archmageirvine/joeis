package irvine.oeis.a006;

import irvine.oeis.LogarithmicTransformSequence;
import irvine.oeis.a000.A000081;

/**
 * A006900 Log of g.f. for rooted trees.
 * @author Sean A. Irvine
 */
public class A006900 extends LogarithmicTransformSequence {

  /** Construct the sequence. */
  public A006900() {
    super(new A000081(), 1);
  }
}
