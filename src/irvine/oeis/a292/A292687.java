package irvine.oeis.a292;

import irvine.math.z.Z;

/**
 * A292687 a(n) = Product_{k=0..n-1} (4^(3^k) + 1) = decimal value of the Sierpinski-type iteration result A292686(n) (replace 0 with 000 and 1 with 101) considered as a binary number.
 * (replace 0 with 000 and 1 with 101) considered as a binary number.
 * @author Georg Fischer
 */
public class A292687 extends A292686 {

  @Override
  public Z next() {
    return new Z(super.next().toString(), 2);
  }
}
