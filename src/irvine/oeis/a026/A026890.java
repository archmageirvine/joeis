package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026890 T(2n+1,n+4), T given by A026769.
 * @author Sean A. Irvine
 */
public class A026890 extends A026769 {

  /** Construct the sequence. */
  public A026890() {
    super(3);
  }

  private long mN = 2;

  @Override
  public Z next() {
    return get(2 * ++mN + 1, mN + 4);
  }
}
