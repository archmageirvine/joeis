package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A392010 allocated for Scott R. Shannon.
 * @author Sean A. Irvine
 */
public class A392010 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final String s = Functions.FACTORIAL.z(++mN).toString();
    long k = -1;
    while (true) {
      if (!s.contains(String.valueOf(++k))) {
        return Z.valueOf(k);
      }
    }
  }
}
