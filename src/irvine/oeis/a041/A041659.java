package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041659 Denominators of continued fraction convergents to <code>sqrt(348)</code>.
 * @author Sean A. Irvine
 */
public class A041659 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041659() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 3134, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 3, 26, 29, 55, 84, 3079, 3163, 6242, 9405, 81482, 90887, 172369, 263256});
  }
}
