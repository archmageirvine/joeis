package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147678 Double, add <code>0,</code> double, add <code>1,</code> double, add <code>2,</code> double, add <code>3,</code> etc.
 * @author Sean A. Irvine
 */
public class A147678 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147678() {
    super(new long[] {2, 0, -5, 0, 4, 0}, new long[] {1, 2, 2, 4, 5, 10});
  }
}
