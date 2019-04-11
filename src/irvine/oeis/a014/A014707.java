package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014707 <code>a(4n)=0, a(4n+2)=1, a(2n+1)=a(n)</code>.
 * @author Sean A. Irvine
 */
public class A014707 extends A014577 {

  @Override
  public Z next() {
    return Z.ONE.subtract(super.next());
  }
}

