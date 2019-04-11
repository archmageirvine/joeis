package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000005;

/**
 * A006218 <code>a(n) =</code> Sum_{k=1..n} <code>floor(n/k)</code>; also Sum_{k=1..n} d(k), where d = number of divisors (A000005); also number of solutions to x*y = z with <code>1 &lt;= x</code>,y,z <code>&lt;= n</code>.
 * @author Sean A. Irvine
 */
public class A006218 extends PartialSumSequence {

  private boolean mFirst = true;

  /** Construct the sequence. */
  public A006218() {
    super(new A000005());
  }

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    return super.next();
  }
}
