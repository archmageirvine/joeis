package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048295 Sequence of 3 Pythagorean triangles, each with a leg and hypotenuse prime. The hypotenuse of each triangle is the leg of the next triangle.
 * @author Sean A. Irvine
 */
public class A048295 extends A048270 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = p.square().add(1).divide2(); // Already prime by A048161
      final Z r = q.square().add(1).divide2(); // Already prime by A048270
      if (r.square().add(1).divide2().isProbablePrime()) {
        return p;
      }
    }
  }
}

