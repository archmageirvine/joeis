package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130196 Period 3: repeat [1, 2, 2].
 * @author Sean A. Irvine
 */
public class A130196 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130196() {
    super(new long[] {1, 0, 0}, new long[] {1, 2, 2});
  }
}
