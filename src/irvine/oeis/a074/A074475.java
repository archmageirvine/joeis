package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074475 a(n)= Sum (T(2i+e),(i=0,1,..,Floor(n/2))), where T(n) are generalized tribonacci numbers (A001644) and e=2(n/2 - Floor(n/2)).
 * @author Sean A. Irvine
 */
public class A074475 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074475() {
    super(new long[] {1, 2, 2, 0}, new long[] {3, 1, 6, 8});
  }
}
