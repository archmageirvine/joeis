package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017332 a(n) = (10*n + 5)^4.
 * @author Sean A. Irvine
 */
public class A017332 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017332() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {625, 50625, 390625, 1500625, 4100625});
  }
}
