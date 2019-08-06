package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024958 <code>a(n) = Sum_{i=1..floor((n+2)/4)} a(2i-1)*a(n-2i+1)</code>, with <code>a(1)=3</code> and <code>a(2)=a(3)=1</code>.
 * @author Sean A. Irvine
 */
public class A024958 extends A024957 {

  @Override
  protected Z a() {
    return Z.THREE;
  }
}
