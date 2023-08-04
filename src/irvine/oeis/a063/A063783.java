package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a001.A001158;

/**
 * A063783 Numbers k such that the sum of the cubes of divisors of k is a prime.
 * @author Sean A. Irvine
 */
public class A063783 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A063783() {
    super(1, new A001158(), Z::isProbablePrime);
  }
}
