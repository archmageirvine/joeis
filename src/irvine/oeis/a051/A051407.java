package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051407 <code>a(n) = 3^n*(3^(n+1)+1)/2</code>.
 * @author Sean A. Irvine
 */
public class A051407 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051407() {
    super(new long[] {-27, 12}, new long[] {2, 15});
  }
}
