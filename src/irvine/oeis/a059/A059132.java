package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059132 A hierarchical sequence (W2{2}c - see A059126).
 * @author Sean A. Irvine
 */
public class A059132 extends A059126 {

  @Override
  public Z next() {
    return super.next().add(super.next()).add(super.next());
  }
}

