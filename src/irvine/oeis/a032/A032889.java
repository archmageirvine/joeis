package irvine.oeis.a032;

/**
 * A032889 Numbers n such that base 10 representation Sum{d(i)*10^i: i=0,1,...,m) has d(0)&lt;d(1)&gt;d(2)&lt;...
 * @author Sean A. Irvine
 */
public class A032889 extends A032882 {

  @Override
  protected int base() {
    return 10;
  }
}
