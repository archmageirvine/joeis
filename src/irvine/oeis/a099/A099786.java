package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099786 a(n) = Sum_{k=0..floor(n/4)} C(n-k,3*k)*3^(n-4*k).
 * @author Sean A. Irvine
 */
public class A099786 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099786() {
    super(new long[] {1, 27, -27, 9}, new long[] {1, 3, 9, 27});
  }
}
