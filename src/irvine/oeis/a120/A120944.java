package irvine.oeis.a120;

import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A120944 Composite squarefree numbers.
 * @author Sean A. Irvine
 */
public class A120944 extends A005117 {

  {
    super.next(); // skip 1
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (!n.isProbablePrime()) {
        return n;
      }
    }
  }
}

