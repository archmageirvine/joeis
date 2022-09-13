package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059141 A hierarchical sequence (W2{3}*c - see A059126).
 * @author Sean A. Irvine
 */
public class A059141 extends A059130 {

  @Override
  public Z next() {
    return super.next().add(super.next()).add(super.next()).add(super.next()).add(super.next()).add(super.next()).add(super.next());
  }
}

