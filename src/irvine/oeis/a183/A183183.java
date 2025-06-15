package irvine.oeis.a183;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A183176.
 * @author Sean A. Irvine
 */
public class A183183 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A183183() {
    super(1, 1, k -> Z.TEN.pow(2L * k + 1).multiply(7).add(Z.TEN.pow(k).multiply(18)).subtract(7).divide(9).isProbablePrime());
  }
}
