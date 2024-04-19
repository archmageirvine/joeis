package irvine.oeis.a333;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a004.A004216;
import irvine.oeis.a032.A032445;

/**
 * A333128 Ending position of the first occurrence of n in the decimal expansion of Pi.
 * @author Georg Fischer
 */
public class A333128 extends AbstractSequence {

  private int mN = -1;
  private final A004216 mSeq1 = new A004216();
  private final A032445 mSeq2 = new A032445();

  /** Construct the sequence. */
  public A333128() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    final Z s1 = (mN == 0) ? Z.ZERO : mSeq1.next();
    final Z s2 = mSeq2.next();
    if (mN <= 9) {
      return s2;
    }
    if (mN <= 99) {
      return s2.add(1);
    }
    return s2.add(s1);
  }
}
