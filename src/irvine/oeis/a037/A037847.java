package irvine.oeis.a037;

/**
 * A037847 a(n)=Sum{d(i-1)-d(i): d(i)&lt;d(i-1), i=0,1,...,m}, where Sum{d(i)*6^i: i=0,1,...,m} is the base 6 representation of n.
 * @author Sean A. Irvine
 */
public class A037847 extends A037844 {

  @Override
  protected long base() {
    return 6;
  }
}
