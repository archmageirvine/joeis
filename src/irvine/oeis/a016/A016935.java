package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016935 <code>a(n) = (6*n + 2)^3</code>.
 * @author Sean A. Irvine
 */
public class A016935 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016935() {
    super(new long[] {-1, 4, -6, 4}, new long[] {8, 512, 2744, 8000});
  }
}
