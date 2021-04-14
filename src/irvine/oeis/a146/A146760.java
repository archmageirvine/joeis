package irvine.oeis.a146;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A146760 Last prime subtrahend at 10^n in A146759.
 * @author Sean A. Irvine
 */
public class A146760 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.multiply(10);
    Z p = mN.add(1); // make it odd so we can step by 2 for prime testing
    Z cb = mN.root(3); // base for smaller cube
    Z c = cb.add(1).pow(3); // current cube
    Z cm = cb.pow(3); // next smaller cube
    while (true) {
      do {
        p = p.subtract(2);
      } while (!p.isProbablePrime());
      while (cm.compareTo(p) > 0) {
        c = cm;
        cb = cb.subtract(1);
        cm = cb.pow(3);
      }
      final Z diff = c.subtract(p);
      if (diff.isProbablePrime()) {
        return p;
      }
      // If the current cube is odd, then this cube can only be the
      // solution if the previous prime was 2 less which we would
      // have just detected.  Therefore for odd cubes we now step
      // down to the previous cube and lower the putative prime as well
      if (c.isOdd()) {
        c = cm;
        cb = cb.subtract(1);
        cm = cb.pow(3);
        p = c.or(Z.ONE); // make sure p remains odd
      }
    }
  }
}
