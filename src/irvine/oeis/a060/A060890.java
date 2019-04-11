package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060890 <code>n^8 + 1</code>.
 * @author Sean A. Irvine
 */
public class A060890 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060890() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 2, 257, 6562, 65537, 390626, 1679617, 5764802, 16777217});
  }
}
