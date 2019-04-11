package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108019 <code>a(n) = (8^n - 1)*4/7</code>.
 * @author Sean A. Irvine
 */
public class A108019 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108019() {
    super(new long[] {-8, 9}, new long[] {0, 4});
  }
}
