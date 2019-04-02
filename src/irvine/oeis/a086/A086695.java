package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086695 a(n) = 100^n - 10^n - 1.
 * @author Sean A. Irvine
 */
public class A086695 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086695() {
    super(new long[] {1000, -1110, 111}, new long[] {89, 9899, 998999});
  }
}
