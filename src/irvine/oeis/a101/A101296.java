package irvine.oeis.a101;

import irvine.oeis.a046.A046523;
import irvine.oeis.transform.RestrictedGrowthTransformSequence;

/**
 * A101296 n has the a(n)-th distinct prime signature.
 * @author Georg Fischer
 */
public class A101296 extends RestrictedGrowthTransformSequence {

  /** Construct the sequence. */
  public A101296() {
    super(1, new A046523());
  }
}
