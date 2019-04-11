package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271527 <code>a(n) = 1000^n + 1</code>.
 * @author Sean A. Irvine
 */
public class A271527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271527() {
    super(new long[] {-1000, 1001}, new long[] {2, 1001});
  }
}
