package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041856 Numerators of continued fraction convergents to <code>sqrt(450)</code>.
 * @author Sean A. Irvine
 */
public class A041856 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041856() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 39202, 0, 0, 0, 0, 0, 0, 0}, new long[] {21, 85, 106, 297, 1294, 2885, 4179, 19601, 827421, 3329285, 4156706, 11642697, 50727494, 113097685, 163825179, 768398401});
  }
}
