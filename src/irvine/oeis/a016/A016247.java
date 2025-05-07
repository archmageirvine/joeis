package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016247 Expansion of 1/((1-x) * (1-6*x) * (1-11*x)).
 * @author Sean A. Irvine
 */
public class A016247 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016247() {
    super(new long[] {66, -83, 18}, new long[] {1, 18, 241});
  }
}
