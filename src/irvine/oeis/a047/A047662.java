package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a008.A008288;

/**
 * A047662 Square array a(n,k) read by antidiagonals: a(n,1)=n, a(1,k)=k, a(n,k)=a(n-1,k-1)+a(n-1,k)+a(n,k-1)+1.
 * @author Sean A. Irvine
 */
public class A047662 extends A008288 {

  /** Construct the sequence. */
  public A047662() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().divide2();
      if (t.signum() > 0) {
        return t;
      }
    }
  }
}
