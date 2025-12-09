package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a083.A083344;

/**
 * A082452 a(n)=2n+1 where n is such that A083344(n) is not zero.
 * @author Sean A. Irvine
 */
public class A082452 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A082452() {
    super(1, new A083344(), NONZERO);
  }

  @Override
  public Z next() {
    return super.next().multiply2().add(1);
  }
}

