package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;

/**
 * A051961 Smallest number w such that A051953(w) = w - phi(w) is the n-th prime.
 * @author Sean A. Irvine
 */
public class A051961 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Sequence seq = new A051953();
    long m = 0;
    do {
      ++m;
    } while (!seq.next().equals(p));
    return Z.valueOf(m);
  }
}
