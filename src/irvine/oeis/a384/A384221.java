package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384221 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384221() {
    super(28645, 31417, 1L << 16);
    //System.out.println("Period: " + computePeriod());
  }
}
