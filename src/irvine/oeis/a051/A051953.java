package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A051953 <code>Cototient(n) </code>:= <code>n - phi(n)</code>.
 * @author Sean A. Irvine
 */
public class A051953 extends A000010 {

  @Override
  public Z next() {
    return super.next().negate().add(mN);
  }
}

