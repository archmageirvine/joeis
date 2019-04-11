package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014941 <code>a(1)=1, a(n)=n*23^(n-1)+a(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A014941 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014941() {
    super(new long[] {529, -575, 47}, new long[] {1, 47, 1634});
  }
}
