package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A393917 allocated for Karl-Heinz Hofmann.
 * @author Sean A. Irvine
 */
public class A393917 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z q = mPrime.nextPrime(p);
    final Z end = q.multiply(p);
    long cnt = 0;
    for (Z s = mPrime.nextPrime(p.add(q)); s.compareTo(end) < 0; s = mPrime.nextPrime(s)) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
