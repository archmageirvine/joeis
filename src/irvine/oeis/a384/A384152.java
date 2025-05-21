package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383809.
 * @author Sean A. Irvine
 */
public class A384152 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384152() {
    super(125, 0, 8192);
    //System.out.println("Period: " + computePeriod());
  }
}
