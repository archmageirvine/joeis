package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027266 <code>a(n) = Sum_{k=0..2n} (k+1) * A026519(n, k)</code>.
 * @author Sean A. Irvine
 */
public class A027266 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027266() {
    super(new long[] {-36, 0, 12, 0}, new long[] {1, 6, 18, 72});
  }
}
