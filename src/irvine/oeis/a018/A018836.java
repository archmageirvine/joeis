package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;
import irvine.oeis.PrependSequence;

/**
 * A018836 Number of squares on infinite chessboard at &lt;= n knight's moves from a fixed square.
 * @author Sean A. Irvine
 */
public class A018836 extends PrependSequence {

  /** Construct the sequence. */
  public A018836() {
    super(new LinearRecurrence(new long[] {1, -3, 3}, new long[] {205, 325, 473}), 1, 9, 41, 109);
  }
}
