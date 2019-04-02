package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078989 Chebyshev sequence with Diophantine property.
 * @author Sean A. Irvine
 */
public class A078989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078989() {
    super(new long[] {-1, 66}, new long[] {1, 67});
  }
}
