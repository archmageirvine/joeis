package irvine.oeis.a224;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A224785 Expansion of (1+4*x+8*x^2-x^3)/((1-x)*(1+x)*(1-3*x^2)).
 * @author Sean A. Irvine
 */
public class A224785 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224785() {
    super(new long[] {-3, 0, 4, 0}, new long[] {1, 4, 12, 15});
  }
}
