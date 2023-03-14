package irvine.oeis.a258;
// manually knestm/knest at 2023-03-13

import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.oeis.a072.A072473;

/**
 * A258934 Half the difference between the 2n-th prime and the n-th prime, starting from n=2.
 * @author Georg Fischer
 */
public class A258934 extends Sequence2 {

  private final A072473 mSeq = new A072473();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return mSeq.next().divide2();
  }
}
