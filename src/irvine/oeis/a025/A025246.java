package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a023.A023431;

/**
 * A025246 a(n) = a(1)*a(n-1) + a(2)*a(n-2) + ... + a(n-3)*a(3) for n &gt;= 4, with initial terms 1, 0, 1, 1.
 * @author Sean A. Irvine
 */
public class A025246 extends PrependSequence {

  /** Construct the sequence. */
  public A025246() {
    super(1, new A023431(), Z.ONE, Z.ZERO);
  }
}
