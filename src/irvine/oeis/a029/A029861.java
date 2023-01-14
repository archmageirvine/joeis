package irvine.oeis.a029;

import irvine.oeis.recur.PaddingSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A029861 Euler transform of 5 4 3 2 1 1 1 1 1 1 1 ...
 * @author Sean A. Irvine
 */
public class A029861 extends EulerTransform {

  /** Construct the sequence. */
  public A029861() {
    super(0, new PaddingSequence(new long[] {5, 4, 3, 2}, new long[] {1}), 1);
  }
}
