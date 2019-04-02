package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143369 The Szeged index of fourth type dendrimer nanostar which has grown n stages.
 * @author Sean A. Irvine
 */
public class A143369 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143369() {
    super(new long[] {64, -160, 148, -64, 13}, new long[] {36604, 304804, 2137492, 13143988, 73561204});
  }
}
