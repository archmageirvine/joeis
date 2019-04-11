package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155659 <code>8^n-7^n+1</code>.
 * @author Sean A. Irvine
 */
public class A155659 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155659() {
    super(new long[] {56, -71, 16}, new long[] {1, 2, 16});
  }
}
