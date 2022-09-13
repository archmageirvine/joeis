package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059137 A hierarchical sequence (W3{2,2}cc - see A059126).
 * @author Sean A. Irvine
 */
public class A059137 extends A059136 {

  @Override
  public Z next() {
    return super.next().add(super.next()).add(super.next());
  }
}

