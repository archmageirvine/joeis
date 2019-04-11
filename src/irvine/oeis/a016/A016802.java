package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016802 <code>a(n) = (4n)^2</code>.
 * @author Sean A. Irvine
 */
public class A016802 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016802() {
    super(new long[] {1, -3, 3}, new long[] {0, 16, 64});
  }
}
