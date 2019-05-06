package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A004002 Benford numbers: <code>a(n)=e^e^...^e (n</code> times) rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A004002 extends MemorySequence {

  private CR mA = CR.ZERO;

  @Override
  protected Z computeNext() {
    mA = mA.exp();
    return mA.round(32);
  }
}

