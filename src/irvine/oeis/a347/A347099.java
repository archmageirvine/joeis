package irvine.oeis.a347;
// manually anopan 1, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a336.A336853;

/**
 * A347099 a(1) = 2; and for n &gt; 1, a(n) = A336853(n) + A347098(n).
 * @author Georg Fischer
 */
public class A347099 extends AbstractSequence {

  private int mN = 0;
  private A336853 mSeq1 = new A336853();
  private A347098 mSeq2 = new A347098();

  /** Construct the sequence. */
  public A347099() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = mSeq1.next().add(mSeq2.next());
    return (mN == 1) ? Z.TWO : result;
  }
}
