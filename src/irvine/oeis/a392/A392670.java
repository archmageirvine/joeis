package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002487;
import irvine.oeis.a046.A046699;

/**
 * A392670 allocated for V. V. Muromtsev.
 * @author Sean A. Irvine
 */
public class A392670 extends Sequence1 {

  private final DirectSequence mStern = new A002487();
  private final Sequence mA = new A046699().skip();

  @Override
  public Z next() {
    return mStern.a(mA.next());
  }
}
