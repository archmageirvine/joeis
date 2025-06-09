package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384745 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384745() {
    super(762939453125L, 1, 1L << 48);
  }
}
