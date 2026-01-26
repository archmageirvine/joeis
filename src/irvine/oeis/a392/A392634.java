package irvine.oeis.a392;

import java.util.LinkedList;

import irvine.math.z.Z;
import irvine.oeis.a020.A020882;

/**
 * A392634 allocated for Robert Israel.
 * @author Sean A. Irvine
 */
public class A392634 extends A020882 {

  private final LinkedList<Z> mA = new LinkedList<>();

  @Override
  protected Z select(final long a, final long b, final long c) {
    //System.out.println("Given: " + a + " " + b + " " + c);
    final long twoR = a + b - c;
    if ((twoR & 1) == 1) {
      return null;
    }
    final long r = twoR / 2;
    final Z prod = Z.valueOf(a).multiply(b).multiply(c).multiply(r);
    final long sum = a + b + c + r;
    if (prod.subtract(sum).isProbablePrime() && prod.add(sum).isProbablePrime()) {
      mA.add(Z.valueOf(a));
      mA.add(Z.valueOf(b));
      mA.add(Z.valueOf(c));
    }
    return null;
  }

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      super.next();
    }
    return mA.pollFirst();
  }
}
