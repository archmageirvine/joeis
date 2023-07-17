package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000105;

/**
 * A057766 Total area of all n-celled polyominoes.
 * @author Sean A. Irvine
 */
public class A057766 extends A000105 {

  /** Construct the sequence. */
  public A057766() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().multiply(mN);
  }
}

