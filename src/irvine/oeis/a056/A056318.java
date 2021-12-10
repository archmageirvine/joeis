package irvine.oeis.a056;
// manually deris/essent at 2021-12-09 19:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a045.A045625;

/**
 * A056318 Number of primitive (aperiodic) reversible strings with n beads using exactly two different colors.
 * @author Georg Fischer
 */
public class A056318 extends PrependSequence {

  /** Construct the sequence. */
  public A056318() {
    super(2, new A045625(), 0);
  }
}
