package irvine.oeis.a018;

import irvine.oeis.FiniteSequence;

/**
 * A018897 Weight distribution of [512,382,16] 9th-order Reed-Muller (or RM) code.
 * @author Sean A. Irvine
 */
public class A018897 extends FiniteSequence {

  /** Construct the sequence. */
  public A018897() {
    super(A018188.read("irvine/oeis/a018/a018897.dat.gz"));
  }
}

