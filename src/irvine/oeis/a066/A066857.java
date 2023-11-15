package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000142;

/**
 * A066857 Smallest number k such that n! - k is a square.
 * @author Sean A. Irvine
 */
public class A066857 extends Sequence1 {

  private final Sequence mF = new A000142().skip();

  @Override
  public Z next() {
    final Z f = mF.next();
    return f.subtract(f.sqrt().square());
  }
}
