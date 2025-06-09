package irvine.oeis.a382;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A382305 allocated for Brock Nash.
 * @author Sean A. Irvine
 */
public class A382305 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A382305() {
    super(25214903917L, 11, 1L << 48);
  }
}
