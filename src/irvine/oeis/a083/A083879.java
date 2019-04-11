package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083879 <code>a(0)=1, a(1)=4, a(n) = 8a(n-1) - 14a(n-2), n&gt;=2</code>.
 * @author Sean A. Irvine
 */
public class A083879 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083879() {
    super(new long[] {-14, 8}, new long[] {1, 4});
  }
}
