package irvine.oeis.a007;

import irvine.oeis.LinearRecurrence;

/**
 * A007482 <code>a(n) =</code> number of subsequences of <code>[ 1, ..., 2n ]</code> in which each odd number has an even neighbor.
 * @author Sean A. Irvine
 */
public class A007482 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007482() {
    super(new long[] {2, 3}, new long[] {1, 3});
  }
}

