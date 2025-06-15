package irvine.oeis.a183;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A183176.
 * @author Sean A. Irvine
 */
public class A183177 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A183177() {
    super(1, 1, k -> Z.TEN.pow(2L * k + 1).add(Z.TEN.pow(k).multiply(15)).subtract(1).divide(3).isProbablePrime());
  }
}
