package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A038753 Nonprime partition numbers.
 * @author Sean A. Irvine
 */
public class A038753 extends A000041 {

  /** Construct the sequence. */
  public A038753() {
    super(1);
  }

  {
    super.next(); // skip 0
  }

  @Override
  public Z next() {
    while (true) {
      final Z partitions = super.next();
      if (!partitions.isProbablePrime()) {
        return partitions;
      }
    }
  }
}
