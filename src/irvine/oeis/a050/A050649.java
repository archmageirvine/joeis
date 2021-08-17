package irvine.oeis.a050;

import irvine.math.z.Z;

/**
 * A050649 a(n+1)^3 is next smallest cube ending with a(n)^3, initial term is 8.
 * @author Sean A. Irvine
 */
public class A050649 extends A050648 {

  @Override
  public Z next() {
    return super.next().root(3);
  }
}
