package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384780 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384780() {
    super(127107890972165L, 0, 1L << 48);
  }
}
