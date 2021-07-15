package irvine.oeis.a140;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A140868 a(n) = floor(floor(n*alpha)*alpha) where alpha = 1+sqrt(2) = A014176.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A140868 implements Sequence {

  private static final CR S = CR.ONE.add(CR.TWO.sqrt());
  private long mN = 0;

  @Override
  public Z next() {
    return S.multiply(S.multiply(++mN).floor()).floor();
  }
}
