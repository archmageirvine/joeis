package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A395788 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A395788 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A395788() {
    super(1, k -> Functions.SOPFR.z(2 * k).equals(Functions.SOPFR.z(k + 2)));
  }
}
