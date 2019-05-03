package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A004694 Fibonacci numbers written in base <code>13. (Next</code> term contains a <code>non-decimal character)</code>.
 * @author Sean A. Irvine
 */
public class A004694 extends A000045 {

  @Override
  public Z next() {
    return new Z(super.next().toString(13));
  }
}

