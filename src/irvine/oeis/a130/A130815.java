package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130815 Period <code>6</code>: repeat <code>[1, 5, 4, -1, -5, -4]</code>.
 * @author Sean A. Irvine
 */
public class A130815 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130815() {
    super(new long[] {-1, 1}, new long[] {1, 5});
  }
}
