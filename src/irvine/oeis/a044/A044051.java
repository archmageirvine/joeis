package irvine.oeis.a044;

import irvine.math.z.Z;
import irvine.oeis.a006.A006995;

/**
 * A044051 a(n)=(s(n)+1)/2, where s=A006995 (base 2 palindromes).
 * @author Sean A. Irvine
 */
public class A044051 extends A006995 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().add(1).divide2();
  }
}

