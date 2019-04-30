package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051941 Truncated triangular pyramid numbers: <code>a(n)=sum(k*(k+1)/2-30,k=8..n)</code>.
 * @author Sean A. Irvine
 */
public class A051941 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051941() {
    super(new long[] {-1, 4, -6, 4}, new long[] {6, 21, 46, 82});
  }
}
