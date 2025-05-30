package irvine.oeis.a221;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A221556 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A221556() {
    super(48271, 0, (1L << 31) - 1, 48271);
    //System.out.println("Period: " + computePeriod());
  }
}
