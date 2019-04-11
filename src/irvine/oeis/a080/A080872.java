package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080872 <code>a(n)*a(n+3) - a(n+1)*a(n+2) = 4,</code> given <code>a(0)=a(1)=1, a(2)=5</code>.
 * @author Sean A. Irvine
 */
public class A080872 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080872() {
    super(new long[] {-1, 0, 10, 0}, new long[] {1, 1, 5, 9});
  }
}
