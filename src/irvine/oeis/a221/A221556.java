package irvine.oeis.a221;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A221556 Consecutive values produced by the C++ minstd_rand random number generator with the default seed (1).
 * @author Sean A. Irvine
 */
public class A221556 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A221556() {
    super(48271, 0, (1L << 31) - 1, 48271);
    //System.out.println("Period: " + computePeriod());
  }
}
