package irvine.oeis.a085;

import irvine.oeis.Combiner;

/**
 * A085396 Numerator and denominator sums of convergents to the Thue-Morse constant, 0.412454033...
 * @author Sean A. Irvine
 */
public class A085396 extends Combiner {

  /** Construct the sequence. */
  public A085396() {
    super(1, new A085394(), new A085395(), ADD);
  }
}
