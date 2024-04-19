package irvine.oeis.a076;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a060.A060696;

/**
 * A076051 Sum of product of odd numbers &lt;= n and the product of even numbers &lt;= n.
 * @author Georg Fischer
 */
public class A076051 extends AbstractSequence {

  private final A060696 mSeq1 = new A060696();

  /** Construct the sequence. */
  public A076051() {
    super(1);
    mSeq1.next();
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next();
  }
}
