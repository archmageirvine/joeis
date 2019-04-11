package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168397 <code>a(n) = 8 * floor(n/2)</code>.
 * @author Sean A. Irvine
 */
public class A168397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168397() {
    super(new long[] {-1, 1, 1}, new long[] {0, 8, 8});
  }
}
