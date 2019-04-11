package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023772 Expansion of <code>1/((1-x)(1-5x)(1-9x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A023772 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023772() {
    super(new long[] {-540, 753, -239, 27}, new long[] {1, 27, 490, 7530});
  }
}
