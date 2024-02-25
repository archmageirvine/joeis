package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a001.A001764;

/**
 * A046646 a(n) = 2*binomial(3*n-3, n-1)/(2*n-1) for n &gt;= 2, and a(1) = 1.
 * @author Sean A. Irvine
 */
public class A046646 extends A001764 {

  /** Construct the sequence. */
  public A046646() {
    super(1);
  }

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return super.next();
    }
    return super.next().multiply2();
  }
}
