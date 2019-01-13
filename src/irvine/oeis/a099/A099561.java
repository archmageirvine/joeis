package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099561.
 * @author Sean A. Irvine
 */
public class A099561 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099561() {
    super(new long[] {-1, 0, 0, -1, 2, 0, 0, 1}, new long[] {0, 0, 0, 0, 1, 1, 1, 1});
  }
}
