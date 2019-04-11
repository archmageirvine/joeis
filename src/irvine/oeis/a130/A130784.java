package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130784 Period 3: repeat <code>[1, 3, 2]</code>.
 * @author Sean A. Irvine
 */
public class A130784 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130784() {
    super(new long[] {1, 0, 0}, new long[] {1, 3, 2});
  }
}
