package irvine.oeis.a146;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A146080 Expansion of 1/(1-x*(1-10*x)).
 * @author Sean A. Irvine
 */
public class A146080 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146080() {
    super(new long[] {-10, 1}, new long[] {1, 1});
  }
}
