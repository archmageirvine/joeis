package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024134 <code>a(n) = 11^n - n^7</code>.
 * @author Sean A. Irvine
 */
public class A024134 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024134() {
    super(new long[] {11, -89, 316, -644, 826, -686, 364, -116, 19}, new long[] {1, 10, -7, -856, -1743, 82926, 1491625, 18663628, 212261729});
  }
}
