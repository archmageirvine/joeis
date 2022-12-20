package irvine.oeis.a177;
// manually dersimple at 2022-12-15 22:48

import irvine.math.z.Z;
import irvine.oeis.Sequence3;
import irvine.oeis.a129.A129654;

/**
 * A177025 Number of ways to represent n as a polygonal number.
 * @author Georg Fischer
 */
public class A177025 extends Sequence3 {

  private final A129654 mSeq = new A129654();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return mSeq.next().subtract(1);
  }
}
