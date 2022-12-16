package irvine.oeis.a347;
// manually anopan 1, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a341.A341512;

/**
 * A347097 a(1) = 2; and for n &gt; 1, a(n) = A341512(n) + A347096(n).
 * @author Georg Fischer
 */
public class A347097 extends AbstractSequence {

  private int mN = 0;
  private A341512 mSeq1 = new A341512();
  private A347096 mSeq2 = new A347096();

  /** Construct the sequence. */
  public A347097() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = mSeq1.next().add(mSeq2.next());
    return (mN == 1) ? Z.TWO : result;
  }
}
