package irvine.oeis.a166;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A166164.
 * @author Sean A. Irvine
 */
public class A166164 implements Sequence {

  private Z mP = null;

  private Z step(final Z p) {
    Z r = null;
    final Z t = mP.multiply2().add(1);
    if (t.isProbablePrime(30)) {
      r = t;
    }
    final String s = p.toString(2);
    for (int k = s.length() - 1; k >= 0; --k) {
      final String left = s.substring(0, k);
      final String right = s.substring(k);
      final Z l = new Z(left + "0" + right, 2);
      if (l.compareTo(p) > 0 && l.isProbablePrime(30)) {
        if (r == null || l.compareTo(r) <= 0) {
          r = l;
        }
      } else {
        final Z o = new Z(left + "1" + right, 2);
        if (o.isProbablePrime(30) && (r == null || o.compareTo(r) <= 0)) {
          r = o;
        }
      }
      //System.out.println("r=" + r + " left=" + left + " right=" + right + " s=" + s);
    }
    if (r == null) {
      final StringBuilder lead = new StringBuilder("10");
      do {
        r = new Z(lead + s, 2);
        lead.append('0');
      } while (!r.isProbablePrime(30));
    }
    return r;
  }

  @Override
  public Z next() {
    if (mP == null) {
      mP = Z.ONE;
    } else if (Z.ONE.equals(mP)) {
      mP = Z.TWO;
    } else {
      mP = step(mP);
    }
    return mP;
  }
}
