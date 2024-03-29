package irvine.oeis.a318;
// Generated by gen_seq4.pl build/arronk

import irvine.math.z.Z;
import irvine.oeis.a305.A305161;

/**
 * A318116 Number of compositions of n into exactly n nonnegative parts &lt;= eight.
 * @author Georg Fischer
 */
public class A318116 extends A305161 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return super.matrixElement(mN, 8);
  }
}

