package irvine.oeis.a302;
// manually 2023-01-13; eulerxfm 0 at 2020-08-22 22:46

import irvine.oeis.recur.PaddingSequence;
import irvine.oeis.transform.EulerTransform;


/**
 * A302856 Number of ways of writing n as a sum of 32 squares.
 * @author Georg Fischer
 */
public class A302856 extends EulerTransform {

  /** Construct the sequence. */
  public A302856() {
    super(0, new PaddingSequence(new long[] {}, new long[] {64, -96, 64, -32}), 1);
  }
}
