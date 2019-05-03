package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence;

/**
 * A020521 <code>13th</code> cyclotomic polynomial evaluated at powers of 2.
 * @author Sean A. Irvine
 */
public class A020521 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Cyclotomic.cyclotomic(13, Z.ONE.shiftLeft(++mN));
  }
}
