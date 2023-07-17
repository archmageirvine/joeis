package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A052001 Even partition numbers.
 * @author Sean A. Irvine
 */
public class A052001 extends A000041 {

  /** Construct the sequence. */
  public A052001() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.isEven()) {
        return p;
      }
    }
  }
}
