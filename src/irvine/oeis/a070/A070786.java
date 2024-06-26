package irvine.oeis.a070;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * A070786 Area of triangles with sides whose squares are integers and with positive integer area, ordered by longest side, then second longest side and finally shortest side.
 * @author Sean A. Irvine
 */
public class A070786 extends A070783 {

  @Override
  protected Z select(final Triangle t) {
    final CR ar = CR.valueOf(t.left()).sqrt();
    final CR br = CR.valueOf(t.mid()).sqrt();
    final CR cr = CR.valueOf(t.right()).sqrt();
    final CR s = ar.add(br).add(cr).divide(2);
    final CR a2 = s.multiply(s.subtract(ar)).multiply(s.subtract(br)).multiply(s.subtract(cr));
    return a2.sqrt().assumeInt().toZ();
  }
}
