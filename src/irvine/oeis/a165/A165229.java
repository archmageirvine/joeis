package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165229 a(0)=1, a(1)=6, a(n)=12*a(n-1)-6*a(n-2) for n&gt;1 .
 * @author Sean A. Irvine
 */
public class A165229 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165229() {
    super(new long[] {-6, 12}, new long[] {1, 6});
  }
}
