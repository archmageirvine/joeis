package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059136 A hierarchical sequence (W3{2,2}c - see A059126).
 * @author Sean A. Irvine
 */
public class A059136 extends A059128 {

  @Override
  public Z next() {
    return super.next().add(super.next()).add(super.next());
  }
}

