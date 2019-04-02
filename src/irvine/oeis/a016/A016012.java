package irvine.oeis.a016;

/**
 * A016012 a(n) = (tau(n^n)+n-1)/n.
 * @author Sean A. Irvine
 */
public class A016012 extends A016006 {

  @Override
  protected int power() {
    return (int) mN;
  }
}
