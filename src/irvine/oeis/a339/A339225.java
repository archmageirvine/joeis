package irvine.oeis.a339;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003430;

/**
 * A339225 Number of unoriented series-parallel networks with n elements.
 * @author Gregory Morse
 */
public class A339225 extends A339159 {
  private final Sequence mOrdered = new A003430().skip(1);

  @Override
  public Z next() {
    return super.next().add(mOrdered.next()).divide2();
  }
}
