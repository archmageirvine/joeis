package irvine.oeis.a367;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000088;
import irvine.oeis.a001.A001349;

/**
 * A367142 Number of connected simple graphs on n unlabeled vertices without universal vertices.
 * @author Gregory Morse
 */
public class A367142 extends Sequence0 {
  private final A001349 mConnected = new A001349();
  private final A000088 mGraphs = new A000088();
  private boolean mFirst = true;

  @Override
  public Z next() {
    final Z connected = mConnected.next();
    if (mFirst) {
      mFirst = false;
      return connected;
    }
    return connected.subtract(mGraphs.next());
  }
}
