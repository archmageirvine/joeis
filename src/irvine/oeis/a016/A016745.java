package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016745 <code>a(n) = (2*n)^5</code>.
 * @author Sean A. Irvine
 */
public class A016745 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016745() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 32, 1024, 7776, 32768, 100000});
  }
}
