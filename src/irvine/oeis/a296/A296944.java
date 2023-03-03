package irvine.oeis.a296;
// manually knestm/knest at 2023-03-02 16:06

import irvine.math.z.Z;

/**
 * A296944 Expansion of (2*x*exp(x)-3)/(1-x).
 * @author Georg Fischer
 */
public class A296944 extends A296943 {

  private int mN = -1;

  @Override
  public Z next() {
    final Z t = super.next().subtract(2);
    return (++mN <= 2) ? Z.valueOf(mN) : t;
  }
}
