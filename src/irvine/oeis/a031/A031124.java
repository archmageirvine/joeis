package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031124 Expansion of (1+z)/(1-z) - 2*Sum_{m&gt;=1} z^(m^2)/(1-z^((m+1)^2)).
 * @author Sean A. Irvine
 */
public class A031124 extends A031123 {

  @Override
  public Z next() {
    final Z t = super.next().multiply2();
    return (mN == 0 ? Z.ONE : Z.TWO).subtract(t);
  }
}

