package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027981 Sum{(k+1)*T(n,k)}, <code>0&lt;=k&lt;=2n,</code> T given by A027960.
 * @author Sean A. Irvine
 */
public class A027981 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027981() {
    super(new long[] {4, -8, 5}, new long[] {1, 10, 40});
  }
}
