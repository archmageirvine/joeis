package irvine.oeis.a343;

import irvine.math.z.Z;

/**
 * A343892 Side b of integer-sided primitive triangles (a, b, c) where side a is the harmonic mean of the 2 other sides b and c, i.e., 2/a = 1/b + 1/c with b &lt; a &lt; c.
 * @author Georg Fischer
 */
public class A343892 extends A343891 {

  @Override
  public Z next() {
    super.next();
    final Z result = super.next();
    super.next();
    return result;
  }
}
