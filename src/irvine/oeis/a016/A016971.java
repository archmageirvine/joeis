package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016971 <code>a(n) = (6*n + 5)^3</code>.
 * @author Sean A. Irvine
 */
public class A016971 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016971() {
    super(new long[] {-1, 4, -6, 4}, new long[] {125, 1331, 4913, 12167});
  }
}
