package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026155 T(n,n-4), where T is the array in A026148.
 * @author Sean A. Irvine
 */
public class A026155 extends A026148 {

  /** Construct the sequence. */
  public A026155() {
    super(4);
  }

  private long mN = 3;

  @Override
  public Z next() {
    return get(++mN, mN - 4);
  }
}
