package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042741 Denominators of continued fraction convergents to sqrt(901).
 * @author Sean A. Irvine
 */
public class A042741 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042741() {
    super(new long[] {1, 60}, new long[] {1, 60});
  }
}
