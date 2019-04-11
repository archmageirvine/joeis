package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093353 <code>a(n) = (n + n mod 2)*(n + 1)/2</code>.
 * @author Sean A. Irvine
 */
public class A093353 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093353() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {2, 3, 8, 10, 18});
  }
}
