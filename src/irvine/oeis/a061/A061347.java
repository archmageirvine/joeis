package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061347 Period <code>3</code>: repeat <code>[1, 1, -2]</code>.
 * @author Sean A. Irvine
 */
public class A061347 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061347() {
    super(new long[] {-1, -1}, new long[] {1, 1});
  }
}
