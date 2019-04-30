package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190984 <code>a(n) = 9*a(n-1) - 7*a(n-2)</code>, with <code>a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A190984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190984() {
    super(new long[] {-7, 9}, new long[] {0, 1});
  }
}
