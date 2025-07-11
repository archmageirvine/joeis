package irvine.oeis.a078;

import irvine.math.z.Z;

/**
 * A078673 Number of ways of arranging the numbers 1..n in a circle so that there is no consecutive triple i, i+1, i+2 or i, i-1, i-2 (mod n).
 * @author Sean A. Irvine
 */
public class A078673 extends A078628 {

  @Override
  public Z next() {
    final Z t = super.next();
    return t.isOne() ? t : t.divide2();
  }
}
