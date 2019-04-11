package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154609 <code>a(n) = 13*n + 5</code>.
 * @author Sean A. Irvine
 */
public class A154609 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154609() {
    super(new long[] {-1, 2}, new long[] {5, 18});
  }
}
