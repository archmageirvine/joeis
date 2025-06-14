package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384971 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384971() {
    super(106, 1283, 6075);
    //System.out.println("Period: " + computePeriod());
  }
}
