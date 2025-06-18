package irvine.oeis.a383;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383162 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A383162 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A383162() {
    super(7200, 1, 279841);
    //System.out.println("Period: " + computePeriod());
  }
}
