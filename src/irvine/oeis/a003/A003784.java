package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A003784 Coefficients of Jacobi cusp form of index 1 and weight 10.
 * @author Sean A. Irvine
 */
public class A003784 extends EulerTransformSequence {

  private long mN = 0;

  /** Construct the sequence. */
  public A003784() {
    super(new PeriodicSequence(-2, -1, -2, -19), 0);
  }

  @Override
  public Z next() {
    return ++mN < 4 ? Z.ZERO : super.next();
  }
}
