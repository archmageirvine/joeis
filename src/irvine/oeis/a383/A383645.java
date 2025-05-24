package irvine.oeis.a383;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383645 allocated for Huaineng He.
 * @author Sean A. Irvine
 */
public class A383645 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A383645() {
    super(17405, 10395331, 1L << 24);
    //System.out.println("Period: " + computePeriod());
  }
}
