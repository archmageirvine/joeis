package irvine.oeis.a055;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.a000.A000178;

/**
 * A055462 Superduperfactorials: product of first n superfactorials.
 * @author Sean A. Irvine
 */
public class A055462 extends PartialProductSequence {

  /** Construct the sequence. */
  public A055462() {
    super(new A000178());
  }
}
