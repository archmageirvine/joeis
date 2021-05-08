package irvine.oeis.a046;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a004.A004009;

/**
 * A046948 Sizes of successive balls in E_8 lattice.
 * @author Sean A. Irvine
 */
public class A046948 extends PartialSumSequence {

  /** Construct the sequence. */
  public A046948() {
    super(new A004009());
  }
}
