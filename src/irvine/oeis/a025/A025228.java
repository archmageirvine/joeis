package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005572;

/**
 * A025228 <code>a(n) = a(1)*a(n-1) + a(2)*a(n-2) + ...+ a(n-1)*a(1)</code> for <code>n &gt;= 3</code>.
 * @author Sean A. Irvine
 */
public class A025228 extends PrependSequence {

  /** Construct the sequence. */
  public A025228() {
    super(new A005572(), Z.TWO);
  }
}
