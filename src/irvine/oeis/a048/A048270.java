package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048270 Sequence of 2 Pythagorean triangles, each with a leg and hypotenuse prime. The leg of the second triangle is the hypotenuse of the first.
 * @author Sean A. Irvine
 */
public class A048270 extends A048161 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = p.square().add(1).divide2(); // Already prime by A048161
      if (q.square().add(1).divide2().isProbablePrime()) {
        return p;
      }
    }
  }
}

