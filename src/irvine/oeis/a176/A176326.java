package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176326 a(3n) is the sequence 7, 6, 5, 4, ...; a(3n+1) is the sequence 9, 11, 13, 15, ...; a(3n+2) is the sequence 11, 8, 5, ...
 * @author Sean A. Irvine
 */
public class A176326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176326() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {7, 9, 11, 6, 11, 8});
  }
}
