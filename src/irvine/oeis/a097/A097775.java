package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097775 Pell equation solutions <code>(14*a(n))^2 - 197*b(n)^2 = -1</code> with <code>b(n) = A097776(n), n &gt;= 0</code>.
 * @author Sean A. Irvine
 */
public class A097775 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097775() {
    super(new long[] {-1, 786}, new long[] {1, 787});
  }
}
