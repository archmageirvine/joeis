package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;
import irvine.oeis.a000.A000129;

/**
 * A001932 Sum of Fibonacci (A000045) and Pell (A000129) numbers.
 * @author Sean A. Irvine
 */
public class A001932 extends A000045 {

  private final A000129 mPell = new A000129();

  @Override
  public Z next() {
    return super.next().add(mPell.next());
  }
}
