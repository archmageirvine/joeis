package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134547 <code>a(n)=5n^2+20n+4</code>.
 * @author Sean A. Irvine
 */
public class A134547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134547() {
    super(new long[] {1, -3, 3}, new long[] {29, 64, 109});
  }
}
