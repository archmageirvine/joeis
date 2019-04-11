package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130658 Period 4: repeat <code>[1, 1, 2, 2]</code>.
 * @author Sean A. Irvine
 */
public class A130658 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130658() {
    super(new long[] {1, -1, 1}, new long[] {1, 1, 2});
  }
}
