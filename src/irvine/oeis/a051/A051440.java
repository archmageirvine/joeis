package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a033.A033844;

/**
 * A051440 a(n) = prime(2^n) + 1.
 * @author Sean A. Irvine
 */
public class A051440 extends A033844 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}

