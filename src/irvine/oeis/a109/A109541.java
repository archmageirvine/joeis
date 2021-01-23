package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109541 a(n) = a(n-2)+a(n-3)+a(n-4)+a(n-5)+2*a(n-6)+a(n-7).
 * @author Sean A. Irvine
 */
public class A109541 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109541() {
    super(new long[] {1, 2, 1, 1, 1, 1, 0}, new long[] {1, 1, 1, 1, 1, 1, 1});
  }
}
