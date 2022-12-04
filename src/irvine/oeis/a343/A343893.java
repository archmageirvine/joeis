package irvine.oeis.a343;

import irvine.math.z.Z;

/**
 * A343893 Side c of integer-sided primitive triangles (a, b, c) where side a is the harmonic mean of the 2 other sides b and c, i.e., 2/a = 1/b + 1/c with b &lt; a &lt; c.
 * @author Georg Fischer
 */
public class A343893 extends A343891 {

  @Override
  public Z next() {
    super.next();
    super.next();
    return super.next();
  }
}
