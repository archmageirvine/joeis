package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383809.
 * @author Sean A. Irvine
 */
public class A384159 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384159() {
    super(20613, 0, 2147483648L);
    //System.out.println("Period: " + computePeriod());
  }
}
