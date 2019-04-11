package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130785 Sequence identical to its third differences: <code>a(n+3) = 3a(n+2)-3a(n+1)+2a(n),</code> with <code>a(0)=1, a(1)=4, a(2)=9</code>.
 * @author Sean A. Irvine
 */
public class A130785 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130785() {
    super(new long[] {2, -3, 3}, new long[] {1, 4, 9});
  }
}
