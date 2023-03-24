package irvine.oeis.a276;
// manually simple3 at 2023-03-24 08:39

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a007.A007917;

/**
 * A276000 Least k such that n! divides phi(k!) (k &gt; 0).
 * @author Georg Fischer
 */
public class A276000 extends AbstractSequence {

  private int mN = 0;
  private final A007917 mSeq = new A007917();

  /** Construct the sequence. */
  public A276000() {
    super(1);
    mSeq.next();
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      return Z.ONE;
    }
    if (mN == 2) {
      return Z.THREE;
    }
    return Z.TWO.multiply(mSeq.next());
  }
}
