package irvine.oeis.a023;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A023772 Expansion of 1/((1-x)(1-5x)(1-9x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A023772 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023772() {
    super(new long[] {-540, 753, -239, 27}, new long[] {1, 27, 490, 7530});
  }
}
