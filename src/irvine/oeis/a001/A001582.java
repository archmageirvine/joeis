package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a000.A000129;

/**
 * A001582.
 * @author Sean A. Irvine
 */
public class A001582 implements Sequence {

  private final Sequence mFibonacci = new A000045();
  private final Sequence mPell = new A000129();

  {
    mFibonacci.next();
    mPell.next();
  }

  @Override
  public Z next() {
    return mFibonacci.next().multiply(mPell.next());
  }
}
