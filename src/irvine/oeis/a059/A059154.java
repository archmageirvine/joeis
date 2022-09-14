package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059154 A hierarchical sequence (W'2{3}c - see A059126).
 * @author Sean A. Irvine
 */
public class A059154 extends A059147 {

  @Override
  public Z next() {
    return super.next().add(super.next()).add(super.next()).add(super.next()).add(super.next()).add(super.next()).add(super.next());
  }
}

