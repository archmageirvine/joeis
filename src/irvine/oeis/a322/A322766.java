package irvine.oeis.a322;
// Generated by gen_seq4.pl build/arronk

import irvine.math.z.Z;
import irvine.oeis.a346.A346500;

/**
 * A322766 Row 1 of array in A322765.
 * @author Georg Fischer
 */
public class A322766 extends A346500 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return super.matrixElement(mN, mN + 1);
  }
}

