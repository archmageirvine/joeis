package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000010;

/**
 * A002088 Sum of totient function: <code>a(n) =</code> Sum_{k=1..n} phi(k), cf. A000010.
 * @author Sean A. Irvine
 */
public class A002088 extends PartialSumSequence {

  private boolean mFirst = true;

  /** Construct the sequence. */
  public A002088() {
    super(new A000010());
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
