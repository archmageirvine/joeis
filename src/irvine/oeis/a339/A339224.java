package irvine.oeis.a339;

import irvine.math.z.Z;
import irvine.oeis.a003.A003430;
import irvine.oeis.gf.GfSequence;

/**
 * A339224 Number of essentially parallel unoriented series-parallel networks with n elements.
 * @author Gregory Morse
 */
public class A339224 extends A339158 {
  private final GfSequence mOrdered = new GfSequence(1, A339289.part(new A003430().skip(1), false));

  @Override
  public Z next() {
    return super.next().add(mOrdered.next()).divide2();
  }
}
