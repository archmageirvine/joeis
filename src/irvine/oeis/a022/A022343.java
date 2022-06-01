package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022343 Expansion of 1/((1-x)*(1-5*x)*(1-6*x)*(1-10*x)).
 * @author Sean A. Irvine
 */
public class A022343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022343() {
    super(new long[] {-300, 440, -161, 22}, new long[] {1, 22, 323, 4004});
  }
}
