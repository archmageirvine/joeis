package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.a099.A099520;

/**
 * A075074 Integers pertaining to A099520: a(n) = {b(n)+b(n+1)}/n where b(n) is the n-th term of A099520.
 * @author Sean A. Irvine
 */
public class A075074 extends A099520 {

  private long mN = 0;
  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.add(t).divide(++mN);
  }
}

