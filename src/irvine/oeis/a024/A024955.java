package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024955 a(n) = Sum_{i=1..floor((n+2)/4)} a(2i-1)*a(n-2i+1), with a(1)=a(2)=1 and a(3)=7.
 * @author Sean A. Irvine
 */
public class A024955 extends A024945 {

  @Override
  protected Z c() {
    return Z.SEVEN;
  }
}
