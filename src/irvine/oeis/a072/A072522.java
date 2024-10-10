package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A072522 Smallest number a(n)&gt;a(n-1) such that T(a(n-1))+T(a(n))=T(m) for some m, a(1)=3; T(i) are the triangular numbers.
 * @author Sean A. Irvine
 */
public class A072522 extends A072521 {

  @Override
  public Z next() {
    return Functions.TRINV.z(super.next());
  }
}
