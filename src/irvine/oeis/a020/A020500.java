package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence;

/**
 * A020500.
 * @author Sean A. Irvine
 */
public class A020500 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Cyclotomic.cyclotomic(++mN, 1);
  }
}
