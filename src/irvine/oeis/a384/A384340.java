package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384340 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384340() {
    super(314159221, 211324863, 1000000000);
    //System.out.println("Period: " + computePeriod());
  }
}
