package irvine.oeis.a196;

import irvine.oeis.LinearRecurrence;

/**
 * A196288 <code>n^8 + n</code>.
 * @author Sean A. Irvine
 */
public class A196288 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196288() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 2, 258, 6564, 65540, 390630, 1679622, 5764808, 16777224});
  }
}
