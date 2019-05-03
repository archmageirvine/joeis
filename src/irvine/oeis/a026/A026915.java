package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026915 <code>a(n) = T(n,0) + T(n,1) +</code> ... <code>+ T(n,n)</code>, T given by <code>A026907</code>.
 * @author Sean A. Irvine
 */
public class A026915 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026915() {
    super(new long[] {2, -5, 4}, new long[] {1, 26, 100});
  }
}
