package irvine.oeis.a046;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a004.A004011;

/**
 * A046949 Sizes of successive balls in D_4 lattice.
 * @author Sean A. Irvine
 */
public class A046949 extends PartialSumSequence {

  /** Construct the sequence. */
  public A046949() {
    super(new A004011());
  }
}
