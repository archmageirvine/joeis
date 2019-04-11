package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042762 Numerators of continued fraction convergents to <code>sqrt(912)</code>.
 * @author Sean A. Irvine
 */
public class A042762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042762() {
    super(new long[] {-1, 0, 302, 0}, new long[] {30, 151, 9090, 45601});
  }
}
