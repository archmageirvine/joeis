package irvine.oeis.a076;
// manually anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a052.A052128;
import irvine.oeis.a354.A354933;

/**
 * A076388 a(n) = minimum of y-x such that x &lt;= y, x*y = n and gcd(x,y)=1.
 * @author Georg Fischer
 */
public class A076388 extends AbstractSequence {

  private final A354933 mSeq1 = new A354933();
  private final A052128 mSeq2 = new A052128();

  /** Construct the sequence. */
  public A076388() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
