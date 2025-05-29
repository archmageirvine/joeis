package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384217 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384217() {
    super(843314861, 453816693, 1L << 31);
    //System.out.println("Period: " + computePeriod());
  }
}
