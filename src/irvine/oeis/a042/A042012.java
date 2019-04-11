package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042012 Numerators of continued fraction convergents to <code>sqrt(530)</code>.
 * @author Sean A. Irvine
 */
public class A042012 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042012() {
    super(new long[] {1, 46}, new long[] {23, 1059});
  }
}
