package irvine.oeis.a001;

import java.io.Serializable;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000081;
import irvine.oeis.a027.A027852;
import irvine.oeis.a068.A068051;

/**
 * A001429.
 * @author Sean A. Irvine
 */
public class A001429 implements Sequence, Serializable {

  private final Sequence mA000081 = new A000081();
  private final Sequence mA027852 = new A027852();
  private final Sequence mA068051 = new A068051();
  {
    mA000081.next();
    next();
    next();
  }

  @Override
  public final Z next() {
    return mA068051.next().subtract(mA027852.next()).subtract(mA000081.next());
  }
}
