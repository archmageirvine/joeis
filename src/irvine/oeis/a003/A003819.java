package irvine.oeis.a003;

/**
 * A003819 a(1)=a(2)=1, a(n+1) = (a(n)^4 +1)/a(n-1).
 * @author Sean A. Irvine
 */
public class A003819 extends A003818 {

  @Override
  protected int pow() {
    return 4;
  }
}
