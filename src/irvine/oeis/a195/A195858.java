package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195858 <code>a(n) =</code> T(10, <code>n),</code> array T given by A047858.
 * @author Sean A. Irvine
 */
public class A195858 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195858() {
    super(new long[] {4, -8, 5}, new long[] {1, 12, 35});
  }
}
