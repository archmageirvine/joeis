package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016261 Expansion of <code>1/((1-x)*(1-9*x)*(1-10*x))</code>.
 * @author Sean A. Irvine
 */
public class A016261 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016261() {
    super(new long[] {90, -109, 20}, new long[] {1, 20, 291});
  }
}
