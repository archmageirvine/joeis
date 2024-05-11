package irvine.oeis.a035;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000578;

/**
 * A035130 Cubes when digits rotated right once remain cubic.
 * @author Sean A. Irvine
 */
public class A035130 extends A000578 {

  /** Construct the sequence. */
  public A035130() {
    super(1);
  }

  {
    super.next(); // skip 0
  }

  @Override
  public Z next() {
    while (true) {
      final Z s = super.next();
      final String t = s.toString();
      if (Predicates.CUBE.is(new Z(t.charAt(t.length() - 1) + t.substring(0, t.length() - 1)))) {
        return s;
      }
    }
  }
}
