package irvine.oeis.a062;

import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001749;

/**
 * A062876 Numbers of lattice points corresponding to incrementally largest circle radii in A062875.
 * @author Sean A. Irvine
 */
public class A062876 extends PrependSequence {

  /** Construct the sequence. */
  public A062876() {
    super(1, new A001749().skip(1), 4);
  }
}
