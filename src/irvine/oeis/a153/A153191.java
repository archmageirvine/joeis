package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153191 <code>a(n) = 9*a(n-1) + 6*a(n-2)</code>; <code>a(0)=0, a(1)=1 </code>.
 * @author Sean A. Irvine
 */
public class A153191 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153191() {
    super(new long[] {6, 9}, new long[] {0, 1});
  }
}
