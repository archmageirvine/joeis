package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000793;

/**
 * A002809 Increasing values of A000793 (largest order of permutation of n elements).
 * @author Sean A. Irvine
 */
public class A002809 extends A000793 {

  /** Construct the sequence. */
  public A002809() {
    super(1);
  }

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.compareTo(mA) <= 0);
    mA = t;
    return mA;
  }
}
