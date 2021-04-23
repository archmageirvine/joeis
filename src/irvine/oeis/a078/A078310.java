package irvine.oeis.a078;
// manually

import irvine.math.z.Z;
import irvine.oeis.a007.A007947;

/**
 * A078310 a(n) = n*rad(n) + 1, where rad = A007947 (squarefree kernel).
 * @author Georg Fischer
 */
public class A078310 extends A007947 {

  protected int mN = 0;
  
  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(super.next()).add(Z.ONE);
  }
}
