package irvine.oeis.a007;

import irvine.oeis.SkipSequence;
import irvine.oeis.a001.A001970;
import irvine.oeis.transform.EulerTransform;

/**
 * A007713 Number of 4-level rooted trees with n leaves.
 * @author Sean A. Irvine
 */
public class A007713 extends EulerTransform {

  /** Construct the sequence. */
  public A007713() {
    super(0, new SkipSequence(new A001970(), 1), 1);
  }
}
