package irvine.oeis.a026;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026356 <code>a(n) = floor((n-1)*phi) + n + 1, n &gt; 0</code>, where phi <code>= (1+sqrt(5))/2</code>.
 * @author Sean A. Irvine
 */
public class A026356 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return CR.PHI.multiply(mN++).floor().add(mN + 1);
  }
}
