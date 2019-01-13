package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052979.
 * @author Sean A. Irvine
 */
public class A052979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052979() {
    super(new long[] {-2, 0, 3, 2}, new long[] {1, 2, 6, 18});
  }
}
