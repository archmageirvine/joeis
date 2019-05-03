package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168361 Period <code>2</code>: repeat <code>2, -1</code>.
 * @author Sean A. Irvine
 */
public class A168361 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168361() {
    super(new long[] {1, 0}, new long[] {2, -1});
  }
}
