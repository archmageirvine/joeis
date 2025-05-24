package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384290 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384290() {
    super(214013, 10395331, 1L << 24);
    //System.out.println("Period: " + computePeriod());
  }
}
