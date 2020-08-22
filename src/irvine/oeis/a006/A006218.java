package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000005;

/**
 * A006218 a(n) = Sum_{k=1..n} floor(n/k); also Sum_{k=1..n} d(k), where d = number of divisors (A000005); also number of solutions to x*y = z with 1 &lt;= x,y,z &lt;= n.
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
