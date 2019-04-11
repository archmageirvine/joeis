package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017473 <code>a(n) = 11*n+7</code>.
 * @author Sean A. Irvine
 */
public class A017473 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017473() {
    super(new long[] {-1, 2}, new long[] {7, 18});
  }
}
