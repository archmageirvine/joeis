package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171640 <code>a(n) = 10*a(n-1)-a(n-2)-4</code> with <code>a(1)=1</code> and <code>a(2)=3</code>.
 * @author Sean A. Irvine
 */
public class A171640 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171640() {
    super(new long[] {1, -11, 11}, new long[] {1, 3, 25});
  }
}
