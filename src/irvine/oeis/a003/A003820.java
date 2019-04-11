package irvine.oeis.a003;

/**
 * A003820 <code>a(1)=a(2)=1, a(n+1) = (a(n)^5 +1)/a(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A003820 extends A003818 {

  @Override
  protected int pow() {
    return 5;
  }
}
