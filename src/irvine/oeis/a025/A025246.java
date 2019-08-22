package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a023.A023431;

/**
 * A025246 <code>a(n) = a(1)*a(n-1) + a(2)*a(n-2) + ...+ a(n-3)*a(3)</code> for <code>n &gt;= 4</code>.
 * @author Sean A. Irvine
 */
public class A025246 extends PrependSequence {

  /** Construct the sequence. */
  public A025246() {
    super(new A023431(), Z.ONE, Z.ZERO);
  }
}
