package irvine.oeis.a007;

import java.util.ArrayList;
import java.util.List;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.transform.PartitionTransformSequence;

/**
 * A007210 Oscillates under partition transform.
 * @author Sean A. Irvine
 */
public class A007210 extends Sequence1 {

  protected final List<Z> mA = new ArrayList<>();
  {
    init();
  }
  protected Polynomial<Z> mB = null;
  private int mN = -1;

  protected void init() {
    mA.add(Z.ONE);
    mA.add(Z.TWO);
    mA.add(Z.THREE);
  }

  @Override
  public Z next() {
    if (++mN == mA.size()) {
      mB = PartitionTransformSequence.partitionTransformZ(mA, mN);
      mA.add(PartitionTransformSequence.partitionTransformZ(mB, mN + 1).coeff(mN + 1));
    }
    return mA.get(mN);
  }
}

