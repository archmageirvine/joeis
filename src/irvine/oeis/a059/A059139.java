package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059139 A hierarchical sequence (W2{2}*c - see A059126).
 * @author Sean A. Irvine
 */
public class A059139 extends A059129 {

  @Override
  public Z next() {
    return super.next().add(super.next()).add(super.next());
  }
}

