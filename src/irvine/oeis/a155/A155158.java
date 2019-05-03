package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155158 Period <code>4</code>: repeat <code>[1, 5, 7, 3]</code>.
 * @author Sean A. Irvine
 */
public class A155158 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155158() {
    super(new long[] {1, -1, 1}, new long[] {1, 5, 7});
  }
}
