package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A052003 Odd partition numbers.
 * @author Sean A. Irvine
 */
public class A052003 extends A000041 {

  /** Construct the sequence. */
  public A052003() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.isOdd()) {
        return p;
      }
    }
  }
}
