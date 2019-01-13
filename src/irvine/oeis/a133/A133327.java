package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133327.
 * @author Sean A. Irvine
 */
public class A133327 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133327() {
    super(new long[] {1, -1, -39202, 39202, 1}, new long[] {1, 241, 19265, 9435905, 755214769});
  }
}
