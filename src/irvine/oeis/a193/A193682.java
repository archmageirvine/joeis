package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193682 Period <code>8</code>: repeat <code>[0, 1, 2, 3, 0, 3, 2, 1]</code>.
 * @author Sean A. Irvine
 */
public class A193682 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193682() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 2, 3, 0, 3, 2, 1});
  }
}
