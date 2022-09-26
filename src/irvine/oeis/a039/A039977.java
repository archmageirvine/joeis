package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a052.A052709;

/**
 * A039977 An example of a d-perfect sequence.
 * @author Sean A. Irvine
 */
public class A039977 extends A052709 {

  {
    super.next();
  }

  private long mMult = -1;

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    final long r = super.next().mod(3);
    mMult = -mMult;
    return Z.valueOf((3 + r * mMult) % 3);
  }
}

