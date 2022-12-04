package irvine.oeis.a343;

import irvine.math.z.Z;

/**
 * A343894 Perimeters of integer-sided primitive triangles (a, b, c) where side a is the harmonic mean of the 2 other sides b and c, i.e., 2/a = 1/b + 1/c with b &lt; a &lt; c. The triples (a, b, c) are listed in increasing order of side a, and if sides a coincide, in increasing order of side b.
 * @author Georg Fischer
 */
public class A343894 extends A343891 {

  @Override
  public Z next() {
    return super.next().add(super.next()).add(super.next());
  }
}
