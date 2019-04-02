package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242853 256*n^8 - 448*n^6 + 240*n^4 - 40*n^2 + 1.
 * @author Sean A. Irvine
 */
public class A242853 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242853() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 9, 40545, 1372105, 15003009, 93149001, 409389409, 1423656585, 4178507265L});
  }
}
