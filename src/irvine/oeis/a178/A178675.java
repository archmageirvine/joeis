package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178675 a(n) = 4^n + 4.
 * @author Sean A. Irvine
 */
public class A178675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178675() {
    super(new long[] {-4, 5}, new long[] {5, 8});
  }
}
