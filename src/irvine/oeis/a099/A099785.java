package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099785 Sum C(n-k,3k)2^(n-3k), k=0..floor(n/4).
 * @author Sean A. Irvine
 */
public class A099785 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099785() {
    super(new long[] {2, 8, -12, 6}, new long[] {1, 2, 4, 8});
  }
}
