package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.a000.A000110;

/**
 * A020557 Number of oriented multigraphs on n labeled arcs (with loops).
 * @author Sean A. Irvine
 */
public class A020557 extends A000110 {

  @Override
  public Z next() {
    final Z t = super.next();
    super.next();
    return t;
  }
}
