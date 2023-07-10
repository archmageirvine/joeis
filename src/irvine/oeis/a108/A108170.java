package irvine.oeis.a108;

import irvine.oeis.a006.A006512;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A108170 Decimal expansion of the number 5.1413105308627310489... having continued fraction expansion 5, 7, 13, 19, 31, 43, 61, 73, 103, 109, 139, 151, 181, ... (greater of twin primes A006512).
 * @author Sean A. Irvine
 */
public class A108170 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A108170() {
    super(1, new A006512());
  }
}
