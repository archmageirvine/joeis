package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007018;

/**
 * A053631 Pythagorean spiral: a(n-1)+1, a(n) and a(n)+1 are the sides of a right triangle (a primitive Pythagorean triangle).
 * @author Georg Fischer
 */
public class A053631 implements Sequence {

  private final Sequence mA007018 = new A007018();

  @Override
  public Z next() {
    return mA007018.next().multiply2();
  }
}
