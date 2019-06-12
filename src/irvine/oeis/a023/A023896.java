package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023896 Sum of positive integers in smallest positive reduced residue system modulo <code>n. a(1) = 1</code> by convention.
 * @author Sean A. Irvine
 */
public class A023896 extends A023022 {

  private long mN = 0;
  {
    super.next();
  }

  @Override
  public Z next() {
    return ++mN <= 2 ? Z.ONE : super.next().multiply(mN);
  }
}

