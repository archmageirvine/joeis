package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027266 <code>a(n) =</code> Sum{(k+1)*T(n,k)}, <code>0&lt;=k&lt;=2n,</code> T given by A026519.
 * @author Sean A. Irvine
 */
public class A027266 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027266() {
    super(new long[] {-36, 0, 12, 0}, new long[] {1, 6, 18, 72});
  }
}
