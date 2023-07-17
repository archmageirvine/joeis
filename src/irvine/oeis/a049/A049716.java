package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049716 a(n) = 2*n + 1 - prevprime(2*n + 1).
 * @author Sean A. Irvine
 */
public class A049716 extends A049711 {

  /** Construct the sequence. */
  public A049716() {
    super(1);
  }

  @Override
  public Z next() {
    final Z res = super.next();
    super.next();
    return res;
  }
}
