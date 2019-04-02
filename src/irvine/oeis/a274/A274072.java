package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274072 a(n) = 5^n-(-1)^n.
 * @author Sean A. Irvine
 */
public class A274072 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274072() {
    super(new long[] {5, 4}, new long[] {0, 6});
  }
}
