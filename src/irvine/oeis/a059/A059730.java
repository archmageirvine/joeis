package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059730 Third diagonal of A059922.
 * @author Sean A. Irvine
 */
public class A059730 extends A059922 {

  /** Construct the sequence. */
  public A059730() {
    super(3);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN + 3);
  }
}

