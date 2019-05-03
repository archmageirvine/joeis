package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242510 Number of n-length words on <code>{1,2,3}</code> such that the maximal blocks (runs) of <code>1</code>'s have odd length, the maximal blocks of <code>2</code>'s have even length and the maximal blocks of <code>3</code>'s have odd length.
 * @author Sean A. Irvine
 */
public class A242510 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242510() {
    super(new long[] {-1, 1, 2, 1}, new long[] {1, 2, 3, 8});
  }
}
