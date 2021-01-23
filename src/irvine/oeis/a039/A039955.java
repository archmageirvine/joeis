package irvine.oeis.a039;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a079.A079896;

/**
 * A039955 Squarefree numbers congruent to 1 mod 4.
 * @author Sean A. Irvine
 */
public class A039955 extends PrependSequence {

  /** Construct the sequence. */
  public A039955() {
    super(new A079896(), 1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (n.mod(4) == 1 && Cheetah.factor(n).isSquareFree()) {
        return n;
      }
    }
  }
}
