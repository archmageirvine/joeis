package irvine.oeis.a032;

/**
 * A032885 Numbers n such that base 6 representation Sum{d(i)*6^i: i=0,1,...,m) has d(0)&lt;d(1)&gt;d(2)&lt;...
 * @author Sean A. Irvine
 */
public class A032885 extends A032882 {

  @Override
  protected int base() {
    return 6;
  }
}
