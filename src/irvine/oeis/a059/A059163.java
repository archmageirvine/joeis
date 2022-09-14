package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059163 A hierarchical sequence (W'3{2,2}*c - see A059126).
 * @author Sean A. Irvine
 */
public class A059163 extends A059151 {

  @Override
  public Z next() {
    return super.next().add(super.next()).add(super.next());
  }
}

