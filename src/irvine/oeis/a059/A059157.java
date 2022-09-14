package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059157 A hierarchical sequence (W'3{2,2}cc - see A059126).
 * @author Sean A. Irvine
 */
public class A059157 extends A059156 {

  @Override
  public Z next() {
    return super.next().add(super.next()).add(super.next());
  }
}

