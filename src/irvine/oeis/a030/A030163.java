package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a047.A047994;

/**
 * A030163 Solutions x of <code>2*uphi(x)=x</code>, where uphi is the unitary phi function <code>(A047994)</code>.
 * @author Sean A. Irvine
 */
public class A030163 extends A047994 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().multiply2().equals(Z.valueOf(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
