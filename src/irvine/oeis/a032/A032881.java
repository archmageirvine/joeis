package irvine.oeis.a032;

/**
 * A032881 Numbers n such that base 10 representation Sum{d(i)*10^i: i=0,1,...,m) has d(0)&gt;d(1)&lt;d(2)&gt;...
 * @author Sean A. Irvine
 */
public class A032881 extends A032874 {

  @Override
  protected int base() {
    return 10;
  }
}
