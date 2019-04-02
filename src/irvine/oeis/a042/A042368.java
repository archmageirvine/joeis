package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042368 Numerators of continued fraction convergents to sqrt(711).
 * @author Sean A. Irvine
 */
public class A042368 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042368() {
    super(new long[] {-1, 0, 0, 0, 160, 0, 0, 0}, new long[] {26, 27, 53, 80, 4213, 4293, 8506, 12799});
  }
}
