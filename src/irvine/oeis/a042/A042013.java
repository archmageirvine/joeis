package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042013 Denominators of continued fraction convergents to <code>sqrt(530)</code>.
 * @author Sean A. Irvine
 */
public class A042013 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042013() {
    super(new long[] {1, 46}, new long[] {1, 46});
  }
}
