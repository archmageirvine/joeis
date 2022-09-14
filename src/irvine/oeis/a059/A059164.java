package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059164 A hierarchical sequence (W'3{2,2}*cc - see A059126).
 * @author Sean A. Irvine
 */
public class A059164 extends A059163 {

  @Override
  public Z next() {
    return super.next().add(super.next()).add(super.next());
  }
}

