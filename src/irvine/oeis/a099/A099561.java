package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099561 Sum C(n-3k,k-1), k=0..floor(n/4).
 * @author Sean A. Irvine
 */
public class A099561 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099561() {
    super(new long[] {-1, 0, 0, -1, 2, 0, 0, 1}, new long[] {0, 0, 0, 0, 1, 1, 1, 1});
  }
}
