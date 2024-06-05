package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a018.A018252;

/**
 * A066071 Nonprime numbers n such that phi(n) + 1 is prime.
 * @author Sean A. Irvine
 */
public class A066071 extends FilterSequence {

  /** Construct the sequence. */
  public A066071() {
    super(1, new A018252(), k -> Functions.PHI.z(k).add(1).isProbablePrime());
  }
}
