package irvine.oeis.a220;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A220753 Expansion of (1+4*x+5*x^2-x^3)/((1-x)*(1+x)*(1-2*x^2)).
 * @author Sean A. Irvine
 */
public class A220753 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220753() {
    super(new long[] {-2, 0, 3, 0}, new long[] {1, 4, 8, 11});
  }
}
