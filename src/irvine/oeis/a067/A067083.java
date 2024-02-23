package irvine.oeis.a067;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067083 Number of digits in n^(n^(n-1)).
 * @author Sean A. Irvine
 */
public class A067083 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return CR.valueOf(++mN).log10().multiply(Z.valueOf(mN).pow(mN - 1)).floor().add(1);
  }
}
