package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a050.A050823;

/**
 * A039728 (Even numbers in Hofstadter Q-sequence)/2.
 * @author Sean A. Irvine
 */
public class A039728 extends A050823 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
