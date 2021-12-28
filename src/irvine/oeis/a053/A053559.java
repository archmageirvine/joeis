package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A053559 Primes formed by concatenating n consecutive increasing numbers starting with a palindrome and ending with the next consecutive palindrome.
 * @author Sean A. Irvine
 */
public class A053559 extends A002113 {

  private Z mP = super.next();

  @Override
  public Z next() {
    while (true) {
      final StringBuilder sb = new StringBuilder();
      Z q = mP;
      mP = super.next();
      do {
        sb.append(q);
        q = q.add(1);
      } while (!q.equals(mP));
      sb.append(q);
      final Z t = new Z(sb);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
