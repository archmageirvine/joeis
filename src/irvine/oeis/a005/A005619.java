package irvine.oeis.a005;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005619 Number of Boolean functions realized by n-input cascades.
 * @author Sean A. Irvine
 */
public class A005619 implements Sequence {

  private static final CR SQRT11 = CR.valueOf(11).sqrt();
  private static final CR T1 = SQRT11.multiply(363);
  private static final CR T2 = SQRT11.multiply(1960);
  private static final CR T3 = SQRT11.multiply(CR.FOUR);
  private static final CR C1 = T1.subtract(CR.valueOf(1202)).divide(T2);
  private static final CR C2 = T1.add(CR.valueOf(1202)).divide(T2);
  private static final CR C3 = CR.valueOf(new Q(48, 49));
  private static final CR ALPHA1 = T3.add(CR.valueOf(16));
  private static final CR ALPHA2 = CR.valueOf(16).subtract(T3);

  private int mN = 2;

  @Override
  public Z next() {
    ++mN;
    return C1.multiply(ComputableReals.SINGLETON.pow(ALPHA1, mN)).add(C2.multiply(ComputableReals.SINGLETON.pow(ALPHA2, mN))).add(C3).toZ();
  }
}

