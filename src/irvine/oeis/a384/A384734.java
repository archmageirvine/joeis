package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384734 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384734() {
    super(513, 29741096258473L, 1L << 47);
  }
}
