package irvine.oeis.a066;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a195.A195202;

/**
 * A066173 Self-reciprocating sequence: the integer part of powers of the reciprocal sum.
 * @author Sean A. Irvine
 */
public class A066173 extends Sequence1 {

  private final CR mS = new A195202().getCR();
  private long mN = 0;

  @Override
  public Z next() {
    return mS.pow(++mN).floor();
  }
}
