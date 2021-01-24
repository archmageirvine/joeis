package irvine.oeis.a038;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a005.A005882;

/**
 * A038587 Sizes of successive clusters in hexagonal lattice A_2 centered at deep hole.
 * @author Sean A. Irvine
 */
public class A038587 extends PartialSumSequence {

  /** Construct the sequence. */
  public A038587() {
    super(new A005882());
  }
}
