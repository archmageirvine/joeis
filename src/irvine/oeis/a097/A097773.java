package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097773 Pell equation solutions <code>(13*b(n))^2 - 170*a(n)^2 = -1</code> with <code>b(n)</code>:=A097772(n), <code>n&gt;=0</code>.
 * @author Sean A. Irvine
 */
public class A097773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097773() {
    super(new long[] {-1, 678}, new long[] {1, 677});
  }
}
