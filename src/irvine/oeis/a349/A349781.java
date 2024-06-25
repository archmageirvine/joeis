package irvine.oeis.a349;
// manually andiv 

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000262;

/**
 * A349781 a(n) = n! * (hypergeom([1 - n], [2], -1) - 1) for n &gt;= 1 and a(0) = 0.
 * @author Georg Fischer
 */
public class A349781 extends AbstractSequence {

  private final A000262 mSeq1 = new A000262();
  private int mN;

  /** Construct the sequence. */
  public A349781() {
    super(0);
    mN = -1;
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(Functions.FACTORIAL.z(++mN));
  }
}
