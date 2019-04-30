package irvine.oeis.a016;

/**
 * A016012 <code>a(n) = (tau(n^n)+n-1)/n</code>.
 * @author Sean A. Irvine
 */
public class A016012 extends A016006 {

  @Override
  protected int power() {
    return (int) mN;
  }
}
