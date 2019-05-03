package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099923 Fourth powers of Lucas numbers <code>A000032</code>.
 * @author Sean A. Irvine
 */
public class A099923 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099923() {
    super(new long[] {1, -5, -15, 15, 5}, new long[] {16, 1, 81, 256, 2401});
  }
}
