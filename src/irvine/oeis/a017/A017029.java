package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017029 <code>a(n) = 7*n + 4</code>.
 * @author Sean A. Irvine
 */
public class A017029 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017029() {
    super(new long[] {-1, 2}, new long[] {4, 11});
  }
}
