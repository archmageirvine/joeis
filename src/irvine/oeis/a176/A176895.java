package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176895 Period <code>4</code>: repeat <code>[1, 4, 2, 4]</code>.
 * @author Sean A. Irvine
 */
public class A176895 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176895() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 4, 2, 4});
  }
}
