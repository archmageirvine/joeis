package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130785 Sequence identical to its third differences: a(n+3) = 3a(n+2)-3a(n+1)+2a(n), with a(0)=1, a(1)=4, a(2)=9.
 * @author Sean A. Irvine
 */
public class A130785 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130785() {
    super(new long[] {2, -3, 3}, new long[] {1, 4, 9});
  }
}
