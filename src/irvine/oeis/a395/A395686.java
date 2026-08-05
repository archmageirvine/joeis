package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a006.A006753;

/**
 * A395686 Numbers k such that Lucas(k) is a Smith number.
 * @author Sean A. Irvine
 */
public class A395686 extends A006753 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (is(Functions.LUCAS.z(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}

