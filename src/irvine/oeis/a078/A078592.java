package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a005.A005316;

/**
 * A078592 Call two meanders from A005316 with 2n crossings equivalent if they differ by reflections in the X or Y axes. Sequence gives number of inequivalent meanders.
 * @author Sean A. Irvine
 */
public class A078592 extends Sequence0 {

  private final DirectSequence mA = DirectSequence.create(new A005316());
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return mA.a(2 * mN).add(mA.a(mN)).divide2();
  }
}

