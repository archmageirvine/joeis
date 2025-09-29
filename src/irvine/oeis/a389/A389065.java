package irvine.oeis.a389;

import irvine.oeis.FilterSequence;
import irvine.oeis.a052.A052485;

/**
 * A389065 Numbers that are neither prime powers nor powerful.
 * @author Sean A. Irvine
 */
public class A389065 extends FilterSequence {

  /** Construct the sequence. */
  public A389065() {
    super(1, new A052485(), k -> !k.isProbablePrime());
  }
}
