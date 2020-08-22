package irvine.oeis.a029;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029712 PDan numbers: numbers n of the form 3^A * 5^B * 7^C * 11^D with n+-2 and n+-4 prime.
 * @author Sean A. Irvine
 */
public class A029712 implements Sequence {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  {
    mPriority.add(Z.ONE);
  }

  @Override
  public Z next() {
    while (true) {
      final Z r = mPriority.pollFirst();
      mPriority.add(r.multiply(3));
      mPriority.add(r.multiply(5));
      mPriority.add(r.multiply(7));
      mPriority.add(r.multiply(11));
      if (r.add(2).isProbablePrime() && r.subtract(2).isProbablePrime() && r.add(4).isProbablePrime() && r.subtract(4).isProbablePrime()) {
        return r;
      }
    }
  }
}
