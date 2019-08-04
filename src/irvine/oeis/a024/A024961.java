package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024961 <code>a(n) = Sum_{i=1..floor((n+2)/4)} a(2i-1)*a(n-2i+1)</code>, with <code>a(1)=2, a(2)=1</code>, and <code>a(3)=3</code>.
 * @author Sean A. Irvine
 */
public class A024961 extends A024945 {

  @Override
  protected Z a() {
    return Z.TWO;
  }

  @Override
  protected Z c() {
    return Z.THREE;
  }
}
