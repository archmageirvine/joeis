package irvine.oeis.a050;

import irvine.math.z.Z;

/**
 * A050651 a(n+1)^3 is next smallest cube ending with a(n)^3, initial term is 27.
 * @author Sean A. Irvine
 */
public class A050651 extends A050650 {

  @Override
  public Z next() {
    return super.next().root(3);
  }
}
