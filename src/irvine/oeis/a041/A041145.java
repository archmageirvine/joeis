package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041145 Denominators of continued fraction convergents to sqrt(82).
 * @author Sean A. Irvine
 */
public class A041145 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041145() {
    super(new long[] {1, 18}, new long[] {1, 18});
  }
}
