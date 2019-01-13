package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a008.A008836;

/**
 * A002819.
 * @author Sean A. Irvine
 */
public class A002819 extends PartialSumSequence {

  private boolean mFirst = true;

  /** Construct the sequence. */
  public A002819() {
    super(new A008836());
  }

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    return super.next();
  }
}
