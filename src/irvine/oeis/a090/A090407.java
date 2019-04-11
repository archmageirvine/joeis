package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090407 <code>a(n) =</code> Sum_{k <code>= 0</code>..n} C(4*n <code>+ 1,</code> 4*k).
 * @author Sean A. Irvine
 */
public class A090407 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090407() {
    super(new long[] {64, 12}, new long[] {1, 6});
  }
}
