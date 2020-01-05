package irvine.oeis.a066;

import irvine.oeis.LinearRecurrence;

/**
 * A066983 <code>a(n+2) = a(n+1) + a(n) + (-1)^n</code>, with <code>a(1) = a(2) = 1</code>.
 * @author Sean A. Irvine
 */
public class A066983 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066983() {
    super(new long[] {1, 2, 0}, new long[] {1, 1, 1});
  }
}
