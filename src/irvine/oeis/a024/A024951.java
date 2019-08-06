package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024951 <code>a(n) = Sum_{i=1..floor((n+2)/4)} a(2i-1)*a(n-2i+1)</code>, with <code>a(1)=a(2)=1</code> and <code>a(3)=5</code>.
 * @author Sean A. Irvine
 */
public class A024951 extends A024945 {

  @Override
  protected Z c() {
    return Z.FIVE;
  }
}
