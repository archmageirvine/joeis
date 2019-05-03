package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131806 Period <code>4</code>: repeat <code>[0, 2, 4, 6]</code>.
 * @author Sean A. Irvine
 */
public class A131806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131806() {
    super(new long[] {1, 0, 0, 0}, new long[] {0, 2, 4, 6});
  }
}
