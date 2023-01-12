package irvine.oeis.a156;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a054.A054353;

/**
 * A156250 Least k such that A078649(k)&gt;= A054353(n).
 * @author Georg Fischer
 */
public class A156250 extends AbstractSequence {

  private A054353 mSeq1 = new A054353();
  private long mN;

  /** Construct the sequence. */
  public A156250() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return mSeq1.next().subtract(mN - 1);
  }
}
