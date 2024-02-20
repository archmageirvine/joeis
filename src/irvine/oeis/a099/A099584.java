package irvine.oeis.a099;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a006.A006093;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A099584 Exponent of 3 in factorization of prime(n) - 1.
 * @author Sean A. Irvine
 */
public class A099584 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A099584() {
    super(1, new A006093(), k -> Z.valueOf(ZUtils.valuation(k, Z.THREE)));
  }
}

