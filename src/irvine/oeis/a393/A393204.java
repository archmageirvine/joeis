package irvine.oeis.a393;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a002.A002884;
import irvine.oeis.a022.A022166;

/**
 * A393204 Number of n X n matrices over GF(2) such that the row space is equal to the column space.
 * @author Sean A. Irvine
 */
public class A393204 extends A022166 {

  private final DirectSequence mA = DirectSequence.create(new A002884());
  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> mA.a(k).multiply(super.next()));
  }
}
