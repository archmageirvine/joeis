package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384387 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384387() {
    super(13493037709L, 7261067085L, 1L << 35);
    //System.out.println("Period: " + computePeriod());
  }
}
