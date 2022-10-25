package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.a000.A000009;

/**
 * A035142 Numbers n with property that number of partitions-into-distinct-parts of n is a perfect square.
 * @author Sean A. Irvine
 */
public class A035142 extends A000009 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.isSquare()) {
        return Z.valueOf(size() - 1);
      }
    }
  }
}

