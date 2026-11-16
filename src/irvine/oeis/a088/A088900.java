package irvine.oeis.a088;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a086.A086378;
import irvine.oeis.a087.A087414;

/**
 * A088900 Numbers n such that 2*n*k(n) is an integer, where k(n) is sum of successive remainders when computing the Euclidean algorithm for (1, 1/sqrt(n)) as defined in A086378 (MuPAD program is given there).
 * @author Sean A. Irvine
 */
public class A088900 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A088900() {
    super(new A086378(), new A087414());
  }
}
