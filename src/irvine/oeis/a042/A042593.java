package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042593 Denominators of continued fraction convergents to <code>sqrt(825)</code>.
 * @author Sean A. Irvine
 */
public class A042593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042593() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 97198, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 4, 7, 11, 18, 83, 101, 184, 285, 469, 1223, 1692, 95975, 97667, 291309, 388976, 680285, 1069261, 1749546, 8067445, 9816991, 17884436, 27701427, 45585863, 118873153, 164459016});
  }
}
