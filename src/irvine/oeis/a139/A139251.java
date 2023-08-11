package irvine.oeis.a139;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a152.A152978;

/**
 * A139251 First differences of toothpicks numbers A139250.
 * @author Georg Fischer
 */
public class A139251 extends Sequence0 {

  private int mN = -1;
  private final A152978 mSeq = new A152978();

  @Override
  public Z next() {
    return (++mN <= 2) ? Z.valueOf(mN) : mSeq.next().multiply(4);
  }
}
