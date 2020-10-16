package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000120;
import irvine.oeis.a001.A001221;

/**
 * A035531 a(n) = A000120(n) + A001221(n) - 1.
 * @author Sean A. Irvine
 */
public class A035531 extends A001221 {

  private final Sequence mA = new SkipSequence(new A000120(), 1);

  @Override
  public Z next() {
    return super.next().add(mA.next()).subtract(1);
  }
}

