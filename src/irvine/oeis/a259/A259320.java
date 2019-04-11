package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259320 <code>a(n) =</code> 2*n*A259319(n) - A259110(n)^2.
 * @author Sean A. Irvine
 */
public class A259320 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259320() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 256, 3584, 21504, 84480, 256256, 652288});
  }
}
