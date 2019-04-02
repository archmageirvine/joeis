package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041499 Denominators of continued fraction convergents to sqrt(266).
 * @author Sean A. Irvine
 */
public class A041499 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041499() {
    super(new long[] {-1, 0, 0, 0, 1370, 0, 0, 0}, new long[] {1, 3, 13, 42, 1357, 4113, 17809, 57540});
  }
}
