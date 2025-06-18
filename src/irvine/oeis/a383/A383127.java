package irvine.oeis.a383;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383127 allocated for Robin Jones.
 * @author Sean A. Irvine
 */
public class A383127 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A383127() {
    super(205, 29573, 139968);
    //System.out.println("Period: " + computePeriod());
  }
}
