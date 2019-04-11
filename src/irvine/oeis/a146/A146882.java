package irvine.oeis.a146;

import irvine.oeis.LinearRecurrence;

/**
 * A146882 <code>a(n) = 5*(4^(n+1)-1)/3</code>.
 * @author Sean A. Irvine
 */
public class A146882 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146882() {
    super(new long[] {-4, 5}, new long[] {5, 25});
  }
}
