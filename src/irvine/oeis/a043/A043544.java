package irvine.oeis.a043;

import irvine.math.z.Z;

/**
 * A043544 Numbers k such that s(k)&lt;s(k-1), where s(k)=sum of all digits in all base b representations of k, for 2&lt;=b&lt;=k.
 * @author Sean A. Irvine
 */
public class A043544 extends A043306 {

  /** Construct the sequence. */
  public A043544() {
    super(1);
  }

  private Z mA = super.next();
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = super.next();
      if (mA.compareTo(t) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
