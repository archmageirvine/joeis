package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A064064 n-th step is to add a(n) to each previous number a(k) (including itself, i.e., k &lt;= n) to produce n+1 more terms of the sequence, starting with a(0)=1.
 * @author Sean A. Irvine
 */
public class A064064 extends AbstractSequence {

  private final A064002 mSeq1 = new A064002();

  /** Construct the sequence. */
  public A064064() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().add(1).divide2();
  }
}
