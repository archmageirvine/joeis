package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000105;
import irvine.oeis.a000.A000988;

/**
 * A030227 Number of achiral polyominoes with n cells.
 * @author Sean A. Irvine
 */
public class A030227 extends A000105 {

  private final Sequence mA = new SkipSequence(new A000988(), 1);
  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().multiply2().subtract(mA.next());
  }
}
