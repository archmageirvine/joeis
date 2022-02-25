package irvine.oeis.a012;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A012245 Characteristic function of factorial numbers; also decimal expansion of Liouville's number or Liouville's constant.
 * @author Sean A. Irvine
 */
public class A012245 extends DecimalExpansionSequence {

  private long mN = 0;
  private long mM = 1;
  private long mF = 1;

  /** Construct the sequence. */
  public A012245() {
    super(CR.ZERO);
  }

  @Override
  public Z next() {
    if (++mN == mF) {
      mF *= ++mM;
      return Z.ONE;
    }
    return Z.ZERO;
  }
}
