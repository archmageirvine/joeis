package irvine.oeis.a383;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A357907.
 * @author Sean A. Irvine
 */
public class A383956 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A383956() {
    super(4253261, 3518565, 1L << 24);
    //System.out.println("Period: " + computePeriod());
  }
}
