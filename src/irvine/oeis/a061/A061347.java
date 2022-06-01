package irvine.oeis.a061;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A061347 Period 3: repeat [1, 1, -2].
 * @author Sean A. Irvine
 */
public class A061347 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061347() {
    super(new long[] {-1, -1}, new long[] {1, 1});
  }
}
