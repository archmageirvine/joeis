package irvine.oeis.a168;

import irvine.math.z.Z;
import irvine.oeis.a091.A091698;

/**
 * A168216 Riordan array (1/(1-x),xc(x)/(1-xc(x))) where c(x)is the g.f. of A000108.It factorizes as A007318*A106566.
 * @author Georg Fischer
 */
public class A168216 extends A091698 {

  @Override
  public Z next() {
    return super.next().abs();
  }
}
