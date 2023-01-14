package irvine.oeis.a029;

import irvine.oeis.recur.PaddingSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A029860 Euler transform of 4 3 2 1 1 1 1 1 1 1 ...
 * @author Sean A. Irvine
 */
public class A029860 extends EulerTransform {

  /** Construct the sequence. */
  public A029860() {
    super(0, new PaddingSequence(new long[] {4, 3, 2}, new long[] {1}), 1);
  }
}
