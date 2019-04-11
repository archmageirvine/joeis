package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129203 <code>a(n) =</code> numerator(3/(n+1)^3)*(3/2 <code>+ (-1)^n/2)</code>.
 * @author Sean A. Irvine
 */
public class A129203 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129203() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {6, 3, 2, 3, 6, 1});
  }
}
