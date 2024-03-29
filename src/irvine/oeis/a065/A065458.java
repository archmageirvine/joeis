package irvine.oeis.a065;
// Generated by gen_seq4.pl A255212/arronk

import irvine.math.z.Z;
import irvine.oeis.a255.A255212;

/**
 * A065458 Number of inequivalent (ordered) solutions to a^2 + b^2 + c^2 + d^2 = n^2.
 * @author Georg Fischer
 */
public class A065458 extends A255212 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return super.matrixElement(mN, 4);
  }
}

