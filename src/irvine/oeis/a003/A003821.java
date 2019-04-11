package irvine.oeis.a003;

/**
 * A003821 <code>a(1)=a(2)=1, a(n+1) = (a(n)^6 +1)/a(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A003821 extends A003818 {

  @Override
  protected int pow() {
    return 6;
  }
}
