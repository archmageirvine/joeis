package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041549 Denominators of continued fraction convergents to sqrt(292).
 * @author Sean A. Irvine
 */
public class A041549 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041549() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4562498, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 11, 23, 34, 125, 1034, 3227, 4261, 11749, 133500, 4550749, 50191739, 104934227, 155125966, 570312125, 4717622966L, 14723181023L, 19440803989L, 53604789001L, 609093483000L});
  }
}
