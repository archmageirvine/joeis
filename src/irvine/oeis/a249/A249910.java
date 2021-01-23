package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249910 Digital root of A003500(n).
 * @author Sean A. Irvine
 */
public class A249910 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249910() {
    super(new long[] {1, -1, 0, 1}, new long[] {2, 4, 5, 7});
  }
}
