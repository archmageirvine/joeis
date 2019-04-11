package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254142 <code>a(n) =</code> (9*n+10)*binomial(n+9,9)/10.
 * @author Sean A. Irvine
 */
public class A254142 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254142() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1, 19, 154, 814, 3289, 11011, 32032, 83512, 199342, 442442, 923780});
  }
}
