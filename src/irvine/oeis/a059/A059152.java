package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059152 A hierarchical sequence (W'2{2}c - see A059126).
 * @author Sean A. Irvine
 */
public class A059152 extends A059146 {

  @Override
  public Z next() {
    return super.next().add(super.next()).add(super.next());
  }
}

