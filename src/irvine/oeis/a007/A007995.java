package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007995 Poincar&#233; series [or Poincare series] of Lie algebra associated with a certain braid group.
 * @author Sean A. Irvine
 */
public class A007995 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).add(91)
      .multiply(mN).add(3731)
      .multiply(mN).add(91091)
      .multiply(mN).add(1474473)
      .multiply(mN).add(16429413)
      .multiply(mN).add(126387833)
      .multiply(mN).add(659772113)
      .multiply(mN).add(430175746)
      .multiply(mN).subtract(19046231204L)
      .multiply(mN).subtract(113904491064L)
      .multiply(mN).add(733785439296L)
      .multiply(mN).add(1856912273280L)
      .multiply(mN).subtract(12048593356800L)
      .multiply(mN).add(13512635136000L)
      .divide(87178291200L);
  }
}
