package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082405 a(n) = 34*a(n-1) - a(n-2); a(0)=0, a(1)=6.
 * @author Sean A. Irvine
 */
public class A082405 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082405() {
    super(new long[] {-1, 34}, new long[] {0, 6});
  }
}
