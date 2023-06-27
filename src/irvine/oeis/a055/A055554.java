package irvine.oeis.a055;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A055554 An arithmetic progression each term of which is followed by at least 4 nonsquarefree consecutive integers.
 * @author Sean A. Irvine
 */
public class A055554 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055554() {
    super(1, new long[] {-1, 2}, new long[] {242, 1757711582});
  }
}
