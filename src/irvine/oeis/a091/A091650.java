package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091650 Let M = the <code>4 X 4</code> matrix <code>[0 1 0 0 / 0 0 1 0 / 0 0 0 1 / -1 -1 3 2]</code>. Set seed vector <code>= [1 1 1 1] =</code> first row, then take <code>M*[1 1 1 1] = [1 1 1 3]</code> then M <code>* [1 1 1 3]</code>, etc. Sequence gives terms in rightmost column.
 * @author Sean A. Irvine
 */
public class A091650 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091650() {
    super(new long[] {-1, -1, 3, 2}, new long[] {1, 3, 7, 21});
  }
}
