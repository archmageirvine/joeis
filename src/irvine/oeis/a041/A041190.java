package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041190 Numerators of continued fraction convergents to sqrt(106).
 * @author Sean A. Irvine
 */
public class A041190 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041190() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 8010, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {10, 31, 72, 103, 175, 278, 453, 1184, 4005, 81284, 247857, 576998, 824855, 1401853, 2226708, 3628561, 9483830, 32080051});
  }
}
