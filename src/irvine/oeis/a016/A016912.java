package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016912 (6n)^4.
 * @author Sean A. Irvine
 */
public class A016912 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016912() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1296, 20736, 104976, 331776});
  }
}
