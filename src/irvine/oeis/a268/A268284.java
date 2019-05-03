package irvine.oeis.a268;

import irvine.oeis.LinearRecurrence;

/**
 * A268284 Period <code>15</code>: repeat <code>{18, 20, 28, 20, 20, 22, 18, 22, 20, 16, 12, 22, 18, 40, 18}</code>.
 * @author Sean A. Irvine
 */
public class A268284 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268284() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {18, 20, 28, 20, 20, 22, 18, 22, 20, 16, 12, 22, 18, 40, 18});
  }
}
