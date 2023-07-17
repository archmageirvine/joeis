package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047676 Main diagonal of square array defined in A047675.
 * @author Sean A. Irvine
 */
public class A047676 extends A047675 {

  /** Construct the sequence. */
  public A047676() {
    super(0);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
