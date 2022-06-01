package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028209 Expansion of 1/((1-6x)(1-7x)(1-11x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A028209 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028209() {
    super(new long[] {-5544, 2682, -473, 36}, new long[] {1, 36, 823, 15282});
  }
}
