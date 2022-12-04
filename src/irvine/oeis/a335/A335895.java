package irvine.oeis.a335;

import irvine.math.z.Z;

/**
 * A335895 Middle side of primitive triples, in nondecreasing order, for integer-sided triangles whose angles A &lt; B &lt; C are in arithmetic progression.
 * @author Georg Fischer
 */
public class A335895 extends A335893 {

  @Override
  public Z next() {
    super.next();
    final Z result = super.next();
    super.next();
    return result;
  }
}
