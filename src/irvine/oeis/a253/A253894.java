package irvine.oeis.a253;

import irvine.math.z.Z;

/**
 * A253894 a(1) = 1, for n &gt; 1, a(n) = 1 + a(A253889(n)).
 * @author Georg Fischer
 */
public class A253894 extends A253893 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
