package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048384 Squares resulting from procedure described in A048383.
 * @author Sean A. Irvine
 */
public class A048384 extends A048380 {

  /** Construct the sequence. */
  public A048384() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.isSquare()) {
        return t;
      }
    }
  }
}
