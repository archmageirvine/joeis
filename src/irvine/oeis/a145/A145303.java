package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145303 a(n) = ((8 + sqrt(8))^n + (8 - sqrt(8))^n)/2.
 * @author Sean A. Irvine
 */
public class A145303 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145303() {
    super(new long[] {-56, 16}, new long[] {1, 8});
  }
}
