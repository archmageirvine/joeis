package irvine.oeis.a357;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A357907 The internal state of the Sinclair ZX81 and Spectrum random number generator.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A357907 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A357907() {
    super(75, 74, 65537);
  }
}
