package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a000.A000009;

/**
 * A056848 Numbers k that divide the number of partitions of k into distinct parts (A000009).
 * @author Sean A. Irvine
 */
public class A056848 extends A000009 {

  {
    setOffset(1);
    super.next(); // skip 0
  }

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(size() - 1) == 0) {
        return Z.valueOf(size() - 1);
      }
    }
  }
}
