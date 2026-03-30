package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A394509 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A394509 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A394509() {
    super(1, k -> Functions.SOPF.z(2 * k).equals(Functions.SOPF.z(k + 2)));
  }
}
