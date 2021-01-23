package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052901 Periodic with period 3: a(3n)=3, a(3n+1)=a(3n+2)=2.
 * @author Sean A. Irvine
 */
public class A052901 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052901() {
    super(new long[] {1, 0, 0}, new long[] {3, 2, 2});
  }
}
