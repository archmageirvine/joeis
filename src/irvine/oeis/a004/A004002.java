package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A004002 Benford numbers: a(n) = e^e^...^e (n times) rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A004002 extends MemorySequence {

  private CR mA = CR.ZERO;

  @Override
  protected Z computeNext() {
    mA = mA.exp();
    return mA.round();
  }
}

