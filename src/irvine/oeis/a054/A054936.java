package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a006.A006384;
import irvine.oeis.a006.A006385;

/**
 * A054936 Duplicate of A006443.
 * @author Sean A. Irvine
 */
public class A054936 extends A006385 {

  /** Construct the sequence. */
  public A054936() {
    super(1);
  }

  private final Sequence mA = new A006384();

  {
    next();
  }

  @Override
  public Z next() {
    return super.next().multiply2().subtract(mA.next());
  }
}
