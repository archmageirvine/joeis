package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384260 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384260() {
    super(3373, 0, (1L << 24) - 3);
    //System.out.println("Period: " + computePeriod());
  }
}
