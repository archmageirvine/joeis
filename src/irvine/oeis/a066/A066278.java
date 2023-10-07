package irvine.oeis.a066;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000142;

/**
 * A066278 Least solution to cototient(x) = n!, where cototient(x) = x-phi(x).
 * @author Sean A. Irvine
 */
public class A066278 extends Sequence1 {

  private final Sequence mF = new A000142().skip();

  @Override
  public Z next() {
    long k = 0;
    final Z f = mF.next();
    while (true) {
      if (Euler.cototient(++k).equals(f)) {
        return Z.valueOf(k);
      }
    }
  }
}
