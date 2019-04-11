package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134931 <code>a(n) = (5*3^n-3)/2</code>.
 * @author Sean A. Irvine
 */
public class A134931 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134931() {
    super(new long[] {-3, 4}, new long[] {1, 6});
  }
}
