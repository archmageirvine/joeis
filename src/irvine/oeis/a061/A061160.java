package irvine.oeis.a061;

import java.util.ArrayList;
import java.util.List;

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.transform.EulerTransformUtils;

/**
 * A061160 Numerators in expansion of Euler transform of b(n) = 1/3.
 * @author Sean A. Irvine
 */
public class A061160 extends Sequence0 {

  private final List<Q> mA = new ArrayList<>();
  private int mN = -1;

  @Override
  public Z next() {
    mA.add(Q.ONE_THIRD);
    return EulerTransformUtils.eulerTransform(Rationals.SINGLETON, mA, ++mN).num();
  }
}
