package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156675 a(n) = 17*((100^(n+1) - 1)/99).
 * @author Sean A. Irvine
 */
public class A156675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156675() {
    super(new long[] {-100, 101}, new long[] {17, 1717});
  }
}
