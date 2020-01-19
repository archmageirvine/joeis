package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072260 <code>a(n) = ((6*n+19)*4^n - 1)/3</code>.
 * @author Sean A. Irvine
 */
public class A072260 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072260() {
    super(new long[] {16, -24, 9}, new long[] {6, 33, 165});
  }
}
