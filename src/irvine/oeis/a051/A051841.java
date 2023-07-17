package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000048;
import irvine.oeis.a001.A001037;

/**
 * A051841 Number of binary Lyndon words with an even number of 1's.
 * @author Sean A. Irvine
 */
public class A051841 extends A001037 {

  /** Construct the sequence. */
  public A051841() {
    super(1);
  }

  private final Sequence mA = new A000048();

  {
    next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
