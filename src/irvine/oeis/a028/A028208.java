package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028208 Expansion of 1/((1-6x)(1-7x)(1-10x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A028208 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028208() {
    super(new long[] {-5040, 2484, -448, 35}, new long[] {1, 35, 777, 13999});
  }
}
