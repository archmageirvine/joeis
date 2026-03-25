package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A394433 allocated for Aied Sulaiman.
 * @author Sean A. Irvine
 */
public class A394433 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A394433() {
    super(1, 1, k -> Functions.GCD.z(k, Functions.PHI.l(k)).isProbablePrime());
  }
}
