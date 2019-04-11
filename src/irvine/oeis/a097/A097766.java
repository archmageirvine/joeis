package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097766 Pell equation solutions <code>(11*a(n))^2 - 122*b(n)^2 = -1</code> with <code>b(n)</code>:=A097767(n), <code>n&gt;=0</code>.
 * @author Sean A. Irvine
 */
public class A097766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097766() {
    super(new long[] {-1, 486}, new long[] {1, 487});
  }
}
