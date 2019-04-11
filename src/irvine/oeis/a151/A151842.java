package irvine.oeis.a151;

import irvine.oeis.LinearRecurrence;

/**
 * A151842 <code>a(3n)=n, a(3n+1)=2n+1, a(3n+2)=n+1</code>.
 * @author Sean A. Irvine
 */
public class A151842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A151842() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {0, 1, 1, 1, 3, 2});
  }
}
