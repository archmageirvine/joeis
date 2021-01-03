package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.a027.A027423;

/**
 * A038024 Number of k's such that A002034(k) = n.
 * @author Sean A. Irvine
 */
public class A038024 extends DifferenceSequence {

  /** Construct the sequence. */
  public A038024() {
    super(new A027423());
  }

  @Override
  public Z next() {
    return Z.ONE.max(super.next());
  }
}

