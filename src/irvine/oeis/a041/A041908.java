package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041908 Numerators of continued fraction convergents to <code>sqrt(476)</code>.
 * @author Sean A. Irvine
 */
public class A041908 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041908() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 57598, 0, 0, 0, 0, 0, 0, 0}, new long[] {21, 22, 109, 240, 2509, 5258, 23541, 28799, 1233099, 1261898, 6280691, 13823280, 144513491, 302850262, 1355914539, 1658764801});
  }
}
