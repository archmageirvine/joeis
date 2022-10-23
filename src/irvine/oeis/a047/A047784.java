package irvine.oeis.a047;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A047784 Nearest integer to Li(n).
 * @author Sean A. Irvine
 */
public class A047784 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    return CR.valueOf(++mN).li().round();
  }
}
