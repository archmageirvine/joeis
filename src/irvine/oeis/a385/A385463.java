package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383129.
 * @author Sean A. Irvine
 */
public class A385463 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385463() {
    super(7141, 54773, 259200);
    //System.out.println("Period: " + computePeriod());
  }
}
