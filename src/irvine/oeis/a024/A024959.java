package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024959 a(n) = Sum_{i=1..floor((n+2)/4)} a(2i-1)*a(n-2i+1), with a(1)=a(3)=2 and a(2)=1.
 * @author Sean A. Irvine
 */
public class A024959 extends A024945 {

  @Override
  protected Z a() {
    return Z.TWO;
  }

  @Override
  protected Z c() {
    return Z.TWO;
  }
}
