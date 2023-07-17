package irvine.oeis.a091;

import irvine.math.z.Z;
import irvine.oeis.a000.A000029;

/**
 * A091696 Number of classes of compositions of n equivalent under reflection or cycling.
 * @author Sean A. Irvine
 */
public class A091696 extends A000029 {

  /** Construct the sequence. */
  public A091696() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}

