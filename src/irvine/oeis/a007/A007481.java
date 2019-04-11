package irvine.oeis.a007;

import irvine.oeis.LinearRecurrence;

/**
 * A007481 Number of subsequences of <code>[ 1,</code>...,n ] in which each even number has <code>an</code> odd neighbor.
 * @author Sean A. Irvine
 */
public class A007481 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007481() {
    super(new long[] {2, 0, 3, 0}, new long[] {1, 2, 3, 7});
  }
}

