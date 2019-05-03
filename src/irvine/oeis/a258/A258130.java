package irvine.oeis.a258;

import irvine.oeis.LinearRecurrence;

/**
 * A258130 Octagonal numbers <code>(A000567)</code> that are the sum of ten consecutive octagonal numbers.
 * @author Sean A. Irvine
 */
public class A258130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258130() {
    super(new long[] {1, -1443, 1443}, new long[] {1045, 1325345, 1910970885});
  }
}
