package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016807 a(n) = (4*n)^7.
 * @author Sean A. Irvine
 */
public class A016807 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016807() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 16384, 2097152, 35831808, 268435456, 1280000000, 4586471424L, 13492928512L});
  }
}
