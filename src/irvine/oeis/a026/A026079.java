package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a025.A025179;

/**
 * A026079 a(n) = Sum_{k = 1..n} T(k,k-1), where T is the array defined in A024996.
 * @author Sean A. Irvine
 */
public class A026079 extends A025179 {

  /** Construct the sequence. */
  public A026079() {
    super(1);
  }

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return super.next().add(2);
  }
}

