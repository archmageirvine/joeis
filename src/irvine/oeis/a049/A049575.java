package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A049575 Prime partition numbers.
 * @author Sean A. Irvine
 */
public class A049575 extends A000041 {

  /** Construct the sequence. */
  public A049575() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z part = super.next();
      if (part.isProbablePrime()) {
        return part;
      }
    }
  }
}

