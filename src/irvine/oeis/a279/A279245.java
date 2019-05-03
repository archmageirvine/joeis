package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279245 Number of subsets of <code>{1, 2, 3</code>, ..., <code>n}</code> that include no consecutive odd integers.
 * @author Sean A. Irvine
 */
public class A279245 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279245() {
    super(new long[] {4, 0, 2, 0}, new long[] {1, 2, 4, 6});
  }
}
