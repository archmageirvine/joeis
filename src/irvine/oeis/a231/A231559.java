package irvine.oeis.a231;

import irvine.oeis.LinearRecurrence;

/**
 * A231559 a(n) = floor( A000326(n)/2 ).
 * @author Sean A. Irvine
 */
public class A231559 extends LinearRecurrence {

  /** Construct the sequence. */
  public A231559() {
    super(new long[] {1, -3, 4, -4, 3}, new long[] {0, 0, 2, 6, 11});
  }
}
