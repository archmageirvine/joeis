package irvine.oeis.a285;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;
import irvine.oeis.a006.A006519;

/**
 * A285326 a(0) = 0, for n &gt; 0, a(n) = n + A006519(n).
 * @author Georg Fischer
 */
public class A285326 extends A006519 implements SequenceWithOffset {

  private int mN = -1;

  /** Construct the sequence. */
  public A285326() {
  }

  @Override
  public int getOffset() {
    return 0;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    return super.next().add(mN);
  }
}
