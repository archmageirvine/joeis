package irvine.oeis.a339;

import irvine.math.z.Z;
import irvine.oeis.a003.A003430;
import irvine.oeis.gf.GfSequence;

/**
 * A339223 Number of essentially series unoriented series-parallel networks with n elements.
 * @author Gregory Morse
 */
public class A339223 extends A339157 {
  private final GfSequence mOrdered = new GfSequence(1, A339289.part(new A003430().skip(1), true));
  private boolean mFirst = true;

  @Override
  public Z next() {
    final Z ordered = mOrdered.next();
    final Z achiral = super.next();
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return achiral.add(ordered).divide2();
  }
}
