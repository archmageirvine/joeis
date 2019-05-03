package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134430 Period <code>4</code>: repeat <code>[1, -2, -2, 1]</code>.
 * @author Sean A. Irvine
 */
public class A134430 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134430() {
    super(new long[] {1, -1, 1}, new long[] {1, -2, -2});
  }
}
