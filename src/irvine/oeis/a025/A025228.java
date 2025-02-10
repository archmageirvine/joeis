package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005572;

/**
 * A025228 a(n) = a(1)*a(n-1) + a(2)*a(n-2) + ...+ a(n-1)*a(1) for n &gt;= 3, with initial terms 2,1.
 * @author Sean A. Irvine
 */
public class A025228 extends PrependSequence {

  /** Construct the sequence. */
  public A025228() {
    super(1, new A005572(), Z.TWO);
  }
}
