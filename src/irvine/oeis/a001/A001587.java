package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000192;
import irvine.oeis.a000.A000411;

/**
 * A001587.
 * @author Sean A. Irvine
 */
public class A001587 implements Sequence {

  private boolean mFirst = false;
  private final Sequence mA192 = new A000192();
  private final Sequence mA411 = new A000411();

  @Override
  public Z next() {
    mFirst = !mFirst;
    return mFirst ? mA192.next() : mA411.next();
  }
}
