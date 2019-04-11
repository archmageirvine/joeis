package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145303 <code>a(n) = ((8 + sqrt(8))^n + (8 - sqrt(8))^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A145303 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145303() {
    super(new long[] {-56, 16}, new long[] {1, 8});
  }
}
