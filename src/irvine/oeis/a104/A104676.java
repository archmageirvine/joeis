package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104676 <code>a(n) =</code> binomial(n+2,2) * binomial(n+7,2).
 * @author Sean A. Irvine
 */
public class A104676 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104676() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {21, 84, 216, 450, 825});
  }
}
