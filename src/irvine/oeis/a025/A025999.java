package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025999 Expansion of g.f. 1/((1-2*x) * (1-5*x) * (1-8*x) * (1-11*x)).
 * @author Sean A. Irvine
 */
public class A025999 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025999() {
    super(new long[] {-880, 806, -231, 26}, new long[] {1, 26, 445, 6370});
  }
}
