package irvine.oeis.a000;

import irvine.oeis.recur.PaddingSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A000713 EULER transform of 3, 2, 2, 2, 2, 2, 2, 2, ...
 * @author Sean A. Irvine
 */
public class A000713 extends EulerTransform {

  /** Construct this sequence. */
  public A000713() {
    super(0, new PaddingSequence(new long[] {3}, new long[] {2}), 1);
  }
}
