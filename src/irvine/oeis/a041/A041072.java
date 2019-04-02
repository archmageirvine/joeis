package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041072 Numerators of continued fraction convergents to sqrt(43).
 * @author Sean A. Irvine
 */
public class A041072 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041072() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6964, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {6, 7, 13, 46, 59, 341, 400, 1541, 1941, 3482, 43725, 47207, 90932, 320003, 410935, 2374678, 2785613, 10731517, 13517130, 24248647});
  }
}
