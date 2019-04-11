package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041381 Denominators of continued fraction convergents to <code>sqrt(205)</code>.
 * @author Sean A. Irvine
 */
public class A041381 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041381() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 79378, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 3, 19, 22, 107, 129, 881, 2772, 78497, 238263, 1508075, 1746338, 8493427, 10239765, 69932017, 220035816});
  }
}
