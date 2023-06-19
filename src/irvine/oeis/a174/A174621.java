package irvine.oeis.a174;
// manually deris/essent at 2022-04-28 12:39

import irvine.math.z.Z;
import irvine.oeis.a046.A046145;

/**
 * A174621 a(n) is the smallest generator for the group of numbers relatively prime to n under multiplication mod n; a(n) = -1 if n is not a power of a prime or twice a power of a prime.
 * @author Georg Fischer
 */
public class A174621 extends A046145 {

  /** Construct the sequence. */
  public A174621() {
    skip(2);
  }

  @Override
  public Z next() {
    final Z t = super.next();
    return t.isZero() ? Z.NEG_ONE : t;
  }
}
