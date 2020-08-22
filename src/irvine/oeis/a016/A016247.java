package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016247 Expansion of 1/((1-x)(1-6x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A016247 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016247() {
    super(new long[] {66, -83, 18}, new long[] {1, 18, 241});
  }
}
