package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277104 <code>a(n) = 9*3^n - 15</code>.
 * @author Sean A. Irvine
 */
public class A277104 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277104() {
    super(new long[] {-3, 4}, new long[] {12, 66});
  }
}
