package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014772 Squares of even hexagonal numbers.
 * @author Sean A. Irvine
 */
public class A014772 extends A014635 {

  /** Construct the sequence. */
  public A014772() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().square();
  }
}
