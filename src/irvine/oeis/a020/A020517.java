package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence;

/**
 * A020517 9th cyclotomic polynomial evaluated at powers of 2.
 * @author Sean A. Irvine
 */
public class A020517 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Cyclotomic.cyclotomic(9, Z.ONE.shiftLeft(++mN));
  }
}
