package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a090.A090344;

/**
 * A039982 Let phi denote the morphism 0 -&gt; 11, 1 -&gt; 10. This sequence is the limit S(oo) where S(0) = 1; S(n+1) = 1.phi(S(n)).
 * @author Sean A. Irvine
 */
public class A039982 extends A090344 {

  @Override
  public Z next() {
    return super.next().isEven() ? Z.ZERO : Z.ONE;
  }
}

