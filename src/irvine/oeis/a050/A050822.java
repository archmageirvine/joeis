package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a005.A005185;

/**
 * A050822 Odd numbers in Hofstadter Q-sequence a(n)=a(n-a(n-1))+a(n-a(n-2)).
 * @author Sean A. Irvine
 */
public class A050822 extends A005185 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.isOdd()) {
        return t;
      }
    }
  }
}
