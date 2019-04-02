package irvine.oeis.a016;

import java.util.ArrayList;

import irvine.math.z.Z;

/**
 * A016058 Primitive pseudo-powers to base 3.
 * @author Sean A. Irvine
 */
public class A016058 extends A016057 {

  // Somewhat conjectural ... seems to match entries

  private final ArrayList<Z> mPrimitive = new ArrayList<>();

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      boolean ok = true;
      for (final Z p : mPrimitive) {
        final Z[] qr = t.divideAndRemainder(p);
        if (Z.ZERO.equals(qr[1])) {
          final Z base = qr[0].isPower();
          if (Z.THREE.equals(qr[0]) || Z.THREE.equals(base)) {
            ok = false;
            break;
          }
        }
      }
      if (ok) {
        mPrimitive.add(t);
        return t;
      }
    }
  }
}
