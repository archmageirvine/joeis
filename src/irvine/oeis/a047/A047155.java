package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047155 T(n,n-3), array T as in A047150.
 * @author Sean A. Irvine
 */
public class A047155 extends A047150 {

  /** Construct the sequence. */
  public A047155() {
    super(3);
  }

  private long mN = 2;

  @Override
  public Z next() {
    return get(++mN, mN - 3);
  }
}
