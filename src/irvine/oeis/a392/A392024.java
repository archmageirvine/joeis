package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A392024 allocated for Aied Sulaiman.
 * @author Sean A. Irvine
 */
public class A392024 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A392024() {
    super(1, k -> Functions.GCD.z(k, Functions.SIGMA0.l(k)).isProbablePrime());
  }
}
