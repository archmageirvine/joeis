package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253673 Indices of centered triangular numbers <code>(A005448)</code> that are also centered octagonal numbers <code>(A016754)</code>.
 * @author Sean A. Irvine
 */
public class A253673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253673() {
    super(new long[] {1, -1, -98, 98, 1}, new long[] {1, 16, 65, 1520, 6321});
  }
}
